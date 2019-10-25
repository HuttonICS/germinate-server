/*
 * Copyright $today.year Information and Computational Sciences,
 * The James Hutton Institute.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

SET FOREIGN_KEY_CHECKS=0;

DROP VIEW IF EXISTS `view_mcpd`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_mcpd` AS select `g`.`id` AS `ID`,`g`.`puid` AS `PUID`,`institutions`.`code` AS `INSTCODE`,`g`.`general_identifier` AS `ACCENUMB`,`g`.`collnumb` AS `COLLNUMB`,`g`.`collcode` AS `COLLCODE`,`g`.`collname` AS `COLLNAME`,`institutions`.`address` AS `COLLINSTADDRESS`,`g`.`collmissid` AS `COLLMISSID`,`taxonomies`.`genus` AS `GENUS`,`taxonomies`.`species` AS `SPECIES`,`taxonomies`.`species_author` AS `SPAUTHOR`,`taxonomies`.`subtaxa` AS `SUBTAXA`,`taxonomies`.`subtaxa_author` AS `SUBTAUTHOR`,`taxonomies`.`cropname` AS `CROPNAME`,`g`.`number` AS `ACCENAME`,replace(`g`.`acqdate`,'-','') AS `ACQDATE`,`countries`.`country_code3` AS `ORIGCTY`,`locations`.`site_name` AS `COLLSITE`,`locations`.`latitude` AS `DECLATITUDE`,NULL AS `LATITUDE`,`locations`.`longitude` AS `DECLONGITUDE`,NULL AS `LONGITUDE`,`locations`.`coordinate_uncertainty` AS `COORDUNCERT`,`locations`.`coordinate_datum` AS `COORDDATUM`,`locations`.`georeferencing_method` AS `GEOREFMETH`,`locations`.`elevation` AS `ELEVATION`,replace(`g`.`colldate`,'-','') AS `COLLDATE`,`g`.`breeders_code` AS `BREDCODE`,`g`.`breeders_name` AS `BREDNAME`,`g`.`biologicalstatus_id` AS `SAMPSTAT`,`pedigreedefinitions`.`definition` AS `ANCEST`,`g`.`collsrc_id` AS `COLLSRC`,`g`.`donor_code` AS `DONORCODE`,`g`.`donor_name` AS `DONORNAME`,`g`.`donor_number` AS `DONORNUMB`,`g`.`othernumb` AS `OTHERNUMB`,`g`.`duplsite` AS `DUPLSITE`,`g`.`duplinstname` AS `DUPLINSTNAME`,group_concat(`storage`.`description` separator ',') AS `STORAGE`,`g`.`mlsstatus_id` AS `MLSSTAT`,(select `attributedata`.`value` from (`attributedata` left join `attributes` on((`attributes`.`id` = `attributedata`.`attribute_id`))) where ((`attributes`.`target_table` = 'germinatebase') and (`attributes`.`name` = 'Remarks') and (`attributedata`.`foreign_id` = `g`.`id`)) limit 1) AS `REMARKS`,`entitytypes`.`name` AS `ENTITYTYPE`,(select `p`.`id` from `germinatebase` `p` where (`p`.`id` = `g`.`entityparent_id`)) AS `ENTITYPARENTID`,(select `p`.`general_identifier` from `germinatebase` `p` where (`p`.`id` = `g`.`entityparent_id`)) AS `ENTITYPARENTACCENUMB` from (((((((((`germinatebase` `g` left join `taxonomies` on((`taxonomies`.`id` = `g`.`taxonomy_id`))) left join `locations` on((`locations`.`id` = `g`.`location_id`))) left join `countries` on((`countries`.`id` = `locations`.`country_id`))) left join `institutions` on((`institutions`.`id` = `g`.`institution_id`))) left join `pedigreedefinitions` on((`pedigreedefinitions`.`germinatebase_id` = `g`.`id`))) left join `storagedata` on((`storagedata`.`germinatebase_id` = `g`.`id`))) left join `storage` on((`storage`.`id` = `storagedata`.`storage_id`))) left join `attributedata` on((`attributedata`.`foreign_id` = `g`.`id`))) left join `entitytypes` on((`entitytypes`.`id` = `g`.`entitytype_id`))) group by `g`.`id`,`pedigreedefinitions`.`id`;

DROP VIEW IF EXISTS `view_table_germplasm`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_germplasm` AS select `germinatebase`.`id` AS `germplasm_id`,`germinatebase`.`general_identifier` AS `germplasm_gid`,`germinatebase`.`name` AS `germplasm_name`,`germinatebase`.`number` AS `germplasm_number`,`germinatebase`.`puid` AS `germplasm_puid`,`entitytypes`.`id` AS `entity_type_id`,`entitytypes`.`name` AS `entity_type_name`,`germinatebase`.`entityparent_id` AS `entity_parent_id`,`biologicalstatus`.`id` AS `biological_status_id`,`biologicalstatus`.`sampstat` AS `biological_status_name`,`synonyms`.`synonyms` AS `synonyms`,`germinatebase`.`collnumb` AS `collector_number`,`taxonomies`.`genus` AS `genus`,`taxonomies`.`species` AS `species`,`taxonomies`.`subtaxa` AS `subtaxa`,`institutions`.`id` AS `institution_id`,`institutions`.`name` AS `institution_name`,`locations`.`site_name` AS `location`,`locations`.`latitude` AS `latitude`,`locations`.`longitude` AS `longitude`,`locations`.`elevation` AS `elevation`,`countries`.`country_name` AS `country_name`,`countries`.`country_code2` AS `country_code`,`germinatebase`.`colldate` AS `coll_date`,`germinatebase`.`pdci` AS `pdci`,(select count(1) from (`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) where ((`imagetypes`.`reference_table` = 'germinatebase') and (`images`.`foreign_id` = `germinatebase`.`id`))) AS `image_count`,(select `images`.`path` from (`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) where ((`imagetypes`.`reference_table` = 'germinatebase') and (`images`.`foreign_id` = `germinatebase`.`id`)) limit 1) AS `first_image_path` from (((((((`germinatebase` left join `institutions` on((`institutions`.`id` = `germinatebase`.`institution_id`))) left join `entitytypes` on((`germinatebase`.`entitytype_id` = `entitytypes`.`id`))) left join `taxonomies` on((`germinatebase`.`taxonomy_id` = `taxonomies`.`id`))) left join `locations` on((`germinatebase`.`location_id` = `locations`.`id`))) left join `countries` on((`locations`.`country_id` = `countries`.`id`))) left join `biologicalstatus` on((`biologicalstatus`.`id` = `germinatebase`.`biologicalstatus_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `germinatebase`.`id`) and (`synonyms`.`synonymtype_id` = 1))));

DROP VIEW IF EXISTS `view_table_maps`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_maps` AS select `maps`.`id` AS `map_id`,`maps`.`name` AS `map_name`,`maps`.`description` AS `map_description`,`maps`.`user_id` AS `user_id`,`maps`.`visibility` AS `visibility`,count(1) AS `marker_count` from (`maps` left join `mapdefinitions` on((`maps`.`id` = `mapdefinitions`.`map_id`))) group by `maps`.`id`;

DROP VIEW IF EXISTS `view_table_dataset_maps`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_dataset_maps` AS select `maps`.`id` AS `map_id`,`maps`.`name` AS `map_name`,`maps`.`description` AS `map_description`,`maps`.`user_id` AS `user_id`,`maps`.`visibility` AS `visibility`,`datasetmembers`.`dataset_id` AS `dataset_id`,count(1) AS `marker_count` from ((`maps` left join `mapdefinitions` on((`maps`.`id` = `mapdefinitions`.`map_id`))) left join `datasetmembers` on(((`datasetmembers`.`foreign_id` = `mapdefinitions`.`marker_id`) and (`datasetmembers`.`datasetmembertype_id` = 1)))) group by `maps`.`id`,`datasetmembers`.`dataset_id`;

DROP VIEW IF EXISTS `view_table_mapdefinitions`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_mapdefinitions` AS select `markers`.`id` AS `marker_id`,`markers`.`marker_name` AS `marker_name`,`synonyms`.`synonyms` AS `synonyms`,`mapfeaturetypes`.`description` AS `map_feature_type`,`maps`.`id` AS `map_id`,`maps`.`user_id` AS `user_id`,`maps`.`visibility` AS `visibility`,`maps`.`name` AS `map_name`,`mapdefinitions`.`chromosome` AS `chromosome`,`mapdefinitions`.`definition_start` AS `position` from ((((`markers` left join `mapdefinitions` on((`markers`.`id` = `mapdefinitions`.`marker_id`))) left join `mapfeaturetypes` on((`mapfeaturetypes`.`id` = `mapdefinitions`.`mapfeaturetype_id`))) left join `maps` on((`maps`.`id` = `mapdefinitions`.`map_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `markers`.`id`) and (`synonyms`.`synonymtype_id` = 2))));

DROP VIEW IF EXISTS `view_table_datasets`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_datasets` AS select `datasets`.`id` AS `dataset_id`,`datasets`.`name` AS `dataset_name`,`datasets`.`description` AS `dataset_description`,`datasets`.`hyperlink` AS `hyperlink`,`datasets`.`source_file` AS `source_file`,`experimenttypes`.`description` AS `experiment_type`,`experiments`.`description` AS `experiment_name`,`datasets`.`datatype` AS `datatype`,`datasetstates`.`name` AS `dataset_state`,`locations`.`site_name` AS `location`,`countries`.`country_code2` AS `country_code`,`countries`.`country_name` AS `country_name`,`licenses`.`id` AS `license_id`,`licenses`.`name` AS `license_name`,`datasets`.`contact` AS `contact`,`datasets`.`date_start` AS `start_date`,`datasets`.`date_end` AS `end_date`,`datasets`.`dublin_core` AS `dublin_core`,`datasetmeta`.`nr_of_data_objects` AS `data_object_count`,`datasetmeta`.`nr_of_data_points` AS `data_point_count`,`datasets`.`is_external` AS `is_external`,(select count(1) from (`collaborators` left join `datasetcollaborators` on((`collaborators`.`id` = `datasetcollaborators`.`collaborator_id`))) where (`datasetcollaborators`.`dataset_id` = `datasets`.`id`)) AS `collaborators`,(select count(1) from (`attributes` left join `attributedata` on((`attributedata`.`attribute_id` = `attributes`.`id`))) where ((`attributes`.`target_table` = 'datasets') and (`attributedata`.`foreign_id` = `datasets`.`id`))) AS `attributes`,cast(concat('[',group_concat(`licenselogs`.`user_id` separator ','),']') as json) AS `accepted_by` from ((((((((`datasets` left join `experiments` on((`experiments`.`id` = `datasets`.`experiment_id`))) left join `experimenttypes` on((`experimenttypes`.`id` = `experiments`.`experiment_type_id`))) left join `licenses` on((`licenses`.`id` = `datasets`.`license_id`))) left join `datasetmeta` on((`datasetmeta`.`dataset_id` = `datasets`.`id`))) left join `datasetstates` on((`datasetstates`.`id` = `datasets`.`dataset_state_id`))) left join `locations` on((`locations`.`id` = `datasets`.`location_id`))) left join `countries` on((`countries`.`id` = `locations`.`country_id`))) left join `licenselogs` on((`licenselogs`.`license_id` = `licenses`.`id`))) group by `datasets`.`id`,`datasetmeta`.`id`;

DROP VIEW IF EXISTS `view_table_licenses`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_licenses` AS select `licenses`.`id` AS `license_id`,`licenses`.`name` AS `license_name`,`licenses`.`description` AS `license_description`,`licensedata`.`content` AS `license_content`,`locales`.`name` AS `locale_name`,`locales`.`description` AS `locale_description`,`datasets`.`id` AS `dataset_id`,cast(concat('[',group_concat(`licenselogs`.`user_id` separator ','),']') as json) AS `accepted_by` from ((((`licenses` left join `licensedata` on((`licensedata`.`license_id` = `licenses`.`id`))) left join `locales` on((`locales`.`id` = `licensedata`.`locale_id`))) left join `datasets` on((`datasets`.`license_id` = `licenses`.`id`))) left join `licenselogs` on((`licenselogs`.`license_id` = `licenses`.`id`))) group by `licenses`.`id`,`locales`.`id`,`licensedata`.`id`,`datasets`.`id`;

DROP VIEW IF EXISTS `view_stats_overview`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_stats_overview` AS select (select count(1) from `germinatebase`) AS `germplasm`,(select count(1) from `markers`) AS `markers`,(select count(1) from `phenotypes`) AS `traits`,(select count(1) from `compounds`) AS `compounds`,(select count(1) from `locations`) AS `locations`,(select count(1) from `groups`) AS `groups`;

DROP VIEW IF EXISTS `view_table_groups`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_groups` AS select `groups`.`id` AS `group_id`,`groups`.`name` AS `group_name`,`groups`.`description` AS `group_description`,`grouptypes`.`id` AS `group_type_id`,`grouptypes`.`target_table` AS `group_type`,`groups`.`created_by` AS `user_id`,`groups`.`visibility` AS `group_visibility`,`groups`.`created_on` AS `created_on`,`groups`.`updated_on` AS `updated_on`,count(`groupmembers`.`id`) AS `count` from ((`groups` left join `grouptypes` on((`groups`.`grouptype_id` = `grouptypes`.`id`))) left join `groupmembers` on((`groupmembers`.`group_id` = `groups`.`id`))) group by `groups`.`id`;

DROP VIEW IF EXISTS `view_table_group_germplasm`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_group_germplasm` AS select `germinatebase`.`id` AS `germplasm_id`,`germinatebase`.`general_identifier` AS `germplasm_gid`,`germinatebase`.`name` AS `germplasm_name`,`germinatebase`.`number` AS `germplasm_number`,`germinatebase`.`puid` AS `germplasm_puid`,`entitytypes`.`id` AS `entity_type_id`,`entitytypes`.`name` AS `entity_type_name`,`germinatebase`.`entityparent_id` AS `entity_parent_id`,`biologicalstatus`.`id` AS `biological_status_id`,`biologicalstatus`.`sampstat` AS `biological_status_name`,`synonyms`.`synonyms` AS `synonyms`,`germinatebase`.`collnumb` AS `collector_number`,`taxonomies`.`genus` AS `genus`,`taxonomies`.`species` AS `species`,`taxonomies`.`subtaxa` AS `subtaxa`,`institutions`.`id` AS `institution_id`,`institutions`.`name` AS `institution_name`,`locations`.`site_name` AS `location`,`locations`.`latitude` AS `latitude`,`locations`.`longitude` AS `longitude`,`locations`.`elevation` AS `elevation`,`countries`.`country_name` AS `country_name`,`countries`.`country_code2` AS `country_code`,`germinatebase`.`colldate` AS `coll_date`,`germinatebase`.`pdci` AS `pdci`,(select count(1) from (`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) where ((`imagetypes`.`reference_table` = 'germinatebase') and (`images`.`foreign_id` = `germinatebase`.`id`))) AS `image_count`,(select `images`.`path` from (`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) where ((`imagetypes`.`reference_table` = 'germinatebase') and (`images`.`foreign_id` = `germinatebase`.`id`)) limit 1) AS `first_image_path`,`groupmembers`.`group_id` AS `group_id` from ((((((((`germinatebase` left join `institutions` on((`institutions`.`id` = `germinatebase`.`institution_id`))) left join `entitytypes` on((`germinatebase`.`entitytype_id` = `entitytypes`.`id`))) left join `taxonomies` on((`germinatebase`.`taxonomy_id` = `taxonomies`.`id`))) left join `locations` on((`germinatebase`.`location_id` = `locations`.`id`))) left join `countries` on((`locations`.`country_id` = `countries`.`id`))) left join `biologicalstatus` on((`biologicalstatus`.`id` = `germinatebase`.`biologicalstatus_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `germinatebase`.`id`) and (`synonyms`.`synonymtype_id` = 1)))) left join `groupmembers` on((`groupmembers`.`foreign_id` = `germinatebase`.`id`)));

DROP VIEW IF EXISTS `view_table_markers`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_markers` AS select `markers`.`id` AS `marker_id`,`markers`.`marker_name` AS `marker_name`,`markertypes`.`description` AS `marker_type`,`synonyms`.`synonyms` AS `marker_synonyms` from ((`markers` left join `markertypes` on((`markertypes`.`id` = `markers`.`markertype_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `markers`.`id`) and (`synonyms`.`synonymtype_id` = 2))));

DROP VIEW IF EXISTS `view_table_group_markers`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_group_markers` AS select `markers`.`id` AS `marker_id`,`markers`.`marker_name` AS `marker_name`,`markertypes`.`description` AS `marker_type`,`synonyms`.`synonyms` AS `marker_synonyms`,`groupmembers`.`group_id` AS `group_id` from (((`markers` left join `markertypes` on((`markertypes`.`id` = `markers`.`markertype_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `markers`.`id`) and (`synonyms`.`synonymtype_id` = 2)))) left join `groupmembers` on((`groupmembers`.`foreign_id` = `markers`.`id`)));

DROP VIEW IF EXISTS `view_table_locations`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_locations` AS select `locations`.`id` AS `location_id`,`locations`.`site_name` AS `location_name`,`locations`.`region` AS `location_region`,`locations`.`state` AS `location_state`,`locationtypes`.`name` AS `location_type`,`locations`.`latitude` AS `location_latitude`,`locations`.`longitude` AS `location_longitude`,`locations`.`elevation` AS `location_elevation`,`countries`.`country_name` AS `country_name`,`countries`.`country_code2` AS `country_code2`,`countries`.`country_code3` AS `country_code3` from ((`locations` left join `countries` on((`countries`.`id` = `locations`.`country_id`))) left join `locationtypes` on((`locationtypes`.`id` = `locations`.`locationtype_id`)));

DROP VIEW IF EXISTS `view_table_group_locations`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_group_locations` AS select `locations`.`id` AS `location_id`,`locations`.`site_name` AS `location_name`,`locations`.`region` AS `location_region`,`locations`.`state` AS `location_state`,`locationtypes`.`name` AS `location_type`,`locations`.`latitude` AS `location_latitude`,`locations`.`longitude` AS `location_longitude`,`locations`.`elevation` AS `location_elevation`,`countries`.`country_name` AS `country_name`,`countries`.`country_code2` AS `country_code2`,`countries`.`country_code3` AS `country_code3`,`groupmembers`.`group_id` AS `group_id` from (((`locations` left join `countries` on((`countries`.`id` = `locations`.`country_id`))) left join `locationtypes` on((`locationtypes`.`id` = `locations`.`locationtype_id`))) left join `groupmembers` on((`groupmembers`.`foreign_id` = `locations`.`id`)));

DROP VIEW IF EXISTS `view_table_images`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_images` AS select `images`.`image_id` AS `image_id`,`images`.`image_description` AS `image_description`,`images`.`image_foreign_id` AS `image_foreign_id`,`images`.`image_path` AS `image_path`,`images`.`image_type` AS `image_type`,`images`.`image_ref_table` AS `image_ref_table`,`images`.`reference_name` AS `reference_name`,`images`.`created_on` AS `created_on` from (select `images`.`id` AS `image_id`,`images`.`description` AS `image_description`,`images`.`foreign_id` AS `image_foreign_id`,`images`.`path` AS `image_path`,`imagetypes`.`description` AS `image_type`,`imagetypes`.`reference_table` AS `image_ref_table`,`germinatebase`.`name` AS `reference_name`,`images`.`created_on` AS `created_on` from ((`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) left join `germinatebase` on((`germinatebase`.`id` = `images`.`foreign_id`))) where (`imagetypes`.`reference_table` like 'germinatebase') union select `images`.`id` AS `image_id`,`images`.`description` AS `image_description`,`images`.`foreign_id` AS `image_foreign_id`,`images`.`path` AS `image_path`,`imagetypes`.`description` AS `image_type`,`imagetypes`.`reference_table` AS `image_ref_table`,`compounds`.`name` AS `reference_name`,`images`.`created_on` AS `created_on` from ((`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) left join `compounds` on((`compounds`.`id` = `images`.`foreign_id`))) where (`imagetypes`.`reference_table` like 'compounds') union select `images`.`id` AS `image_id`,`images`.`description` AS `image_description`,`images`.`foreign_id` AS `image_foreign_id`,`images`.`path` AS `image_path`,`imagetypes`.`description` AS `image_type`,`imagetypes`.`reference_table` AS `image_ref_table`,`phenotypes`.`name` AS `reference_name`,`images`.`created_on` AS `created_on` from ((`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) left join `phenotypes` on((`phenotypes`.`id` = `images`.`foreign_id`))) where (`imagetypes`.`reference_table` like 'phenotypes')) `images`;

DROP VIEW IF EXISTS `view_table_traits`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_traits` AS select `phenotypes`.`id` AS `trait_id`,`phenotypes`.`name` AS `trait_name`,`phenotypes`.`short_name` AS `trait_name_short`,`phenotypes`.`description` AS `trait_description`,`phenotypes`.`datatype` AS `data_type`,`units`.`id` AS `unit_id`,`units`.`unit_name` AS `unit_name`,`units`.`unit_description` AS `unit_description`,`units`.`unit_abbreviation` AS `unit_abbreviation`,`synonyms`.`synonyms` AS `synonyms`,(select count(1) from `phenotypedata` where (`phenotypedata`.`phenotype_id` = `phenotypes`.`id`)) AS `count` from ((`phenotypes` left join `units` on((`units`.`id` = `phenotypes`.`unit_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `phenotypes`.`id`) and (`synonyms`.`synonymtype_id` = 4)))) group by `phenotypes`.`id`,`synonyms`.`id`;

DROP VIEW IF EXISTS `view_table_collaborators`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_collaborators` AS select `collaborators`.`id` AS `collaborator_id`,`collaborators`.`first_name` AS `collaborator_first_name`,`collaborators`.`last_name` AS `collaborator_last_name`,`collaborators`.`email` AS `collaborator_email`,`collaborators`.`phone` AS `collaborator_phone`,`institutions`.`id` AS `institution_id`,`institutions`.`name` AS `institution_name`,`institutions`.`address` AS `institution_address`,`datasets`.`id` AS `dataset_id`,`countries`.`id` AS `country_id`,`countries`.`country_name` AS `country_name`,`countries`.`country_code2` AS `country_code2`,`countries`.`country_code3` AS `country_code3` from ((((`collaborators` left join `institutions` on((`institutions`.`id` = `collaborators`.`institution_id`))) left join `countries` on((`countries`.`id` = `institutions`.`country_id`))) left join `datasetcollaborators` on((`datasetcollaborators`.`collaborator_id` = `collaborators`.`id`))) left join `datasets` on((`datasets`.`id` = `datasetcollaborators`.`dataset_id`)));

DROP VIEW IF EXISTS `view_table_trials_data`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_trials_data` AS select `germinatebase`.`id` AS `germplasm_id`,`germinatebase`.`general_identifier` AS `germplasm_gid`,`germinatebase`.`name` AS `germplasm_name`,`entitytypes`.`name` AS `entity_type`,`datasets`.`id` AS `dataset_id`,`datasets`.`name` AS `dataset_name`,`datasets`.`description` AS `dataset_description`,`locations`.`site_name` AS `location_name`,`countries`.`country_name` AS `country_name`,`countries`.`country_code2` AS `country_code2`,`phenotypes`.`name` AS `trait_name`,`phenotypes`.`short_name` AS `trait_name_short`,`units`.`unit_name` AS `unit_name`,`phenotypedata`.`recording_date` AS `recording_date`,`phenotypedata`.`phenotype_value` AS `trait_value` from (((((((`phenotypedata` left join `germinatebase` on((`germinatebase`.`id` = `phenotypedata`.`germinatebase_id`))) left join `entitytypes` on((`entitytypes`.`id` = `germinatebase`.`entitytype_id`))) left join `phenotypes` on((`phenotypes`.`id` = `phenotypedata`.`phenotype_id`))) left join `units` on((`units`.`id` = `phenotypes`.`unit_id`))) left join `datasets` on((`datasets`.`id` = `phenotypedata`.`dataset_id`))) left join `locations` on((`phenotypedata`.`location_id` = `locations`.`id`))) left join `countries` on((`countries`.`id` = `locations`.`country_id`)));

DROP VIEW IF EXISTS `view_table_compound_data`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_compound_data` AS select `germinatebase`.`id` AS `germplasm_id`,`germinatebase`.`general_identifier` AS `germplasm_gid`,`germinatebase`.`name` AS `germplasm_name`,`entitytypes`.`name` AS `entity_type`,`datasets`.`id` AS `dataset_id`,`datasets`.`name` AS `dataset_name`,`datasets`.`description` AS `dataset_description`,`compounds`.`name` AS `compound_name`,`units`.`unit_name` AS `unit_name`,`compounddata`.`recording_date` AS `recording_date`,`compounddata`.`compound_value` AS `compound_value` from (((((`compounddata` left join `germinatebase` on((`germinatebase`.`id` = `compounddata`.`germinatebase_id`))) left join `entitytypes` on((`entitytypes`.`id` = `germinatebase`.`entitytype_id`))) left join `compounds` on((`compounds`.`id` = `compounddata`.`compound_id`))) left join `units` on((`units`.`id` = `compounds`.`unit_id`))) left join `datasets` on((`datasets`.`id` = `compounddata`.`dataset_id`)));

DROP VIEW IF EXISTS `view_table_pedigrees`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_pedigrees` AS select `parent`.`id` AS `parent_id`,`parent`.`general_identifier` AS `parent_gid`,`parent`.`name` AS `parent_name`,`child`.`id` AS `child_id`,`child`.`general_identifier` AS `child_gid`,`child`.`name` AS `child_name`,`pedigrees`.`relationship_type` AS `relationship_type`,`pedigrees`.`relationship_description` AS `relationship_description`,`pedigreedescriptions`.`name` AS `pedigree_description`,`pedigreedescriptions`.`author` AS `pedigree_author` from (((`pedigrees` left join `germinatebase` `parent` on((`parent`.`id` = `pedigrees`.`parent_id`))) left join `germinatebase` `child` on((`child`.`id` = `pedigrees`.`germinatebase_id`))) left join `pedigreedescriptions` on((`pedigreedescriptions`.`id` = `pedigrees`.`pedigreedescription_id`)));

DROP VIEW IF EXISTS `view_table_entities`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_entities` AS select `parent`.`id` AS `entity_parent_id`,`parent`.`general_identifier` AS `entity_parent_gid`,`parent`.`name` AS `entity_parent_name`,`parententity`.`name` AS `entity_parent_type`,`child`.`id` AS `entity_child_id`,`child`.`general_identifier` AS `entity_child_gid`,`child`.`name` AS `entity_child_name`,`childentity`.`name` AS `entity_child_type` from (((`germinatebase` `parent` left join `germinatebase` `child` on((`parent`.`id` = `child`.`entityparent_id`))) left join `entitytypes` `parententity` on((`parententity`.`id` = `parent`.`entitytype_id`))) left join `entitytypes` `childentity` on((`childentity`.`id` = `child`.`entitytype_id`))) where ((`parent`.`id` is not null) and (`child`.`id` is not null));

DROP VIEW IF EXISTS `view_table_germplasm_attributes`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_germplasm_attributes` AS select `germinatebase`.`id` AS `germplasm_id`,`germinatebase`.`general_identifier` AS `germplasm_gid`,`germinatebase`.`name` AS `germplasm_name`,`attributes`.`id` AS `attribute_id`,`attributes`.`name` AS `attribute_name`,`attributes`.`description` AS `attribute_description`,`attributes`.`datatype` AS `attribute_type`,`attributes`.`target_table` AS `target_table`,`attributedata`.`foreign_id` AS `foreign_id`,`attributedata`.`value` AS `attribute_value` from ((`attributedata` left join `germinatebase` on((`attributedata`.`foreign_id` = `germinatebase`.`id`))) left join `attributes` on((`attributes`.`id` = `attributedata`.`attribute_id`))) where (`attributes`.`target_table` = 'germinatebase');

DROP VIEW IF EXISTS `view_table_dataset_attributes`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_dataset_attributes` AS select `datasets`.`id` AS `dataset_id`,`datasets`.`name` AS `dataset_name`,`datasets`.`description` AS `dataset_description`,`attributes`.`id` AS `attribute_id`,`attributes`.`name` AS `attribute_name`,`attributes`.`description` AS `attribute_description`,`attributes`.`datatype` AS `attribute_type`,`attributes`.`target_table` AS `target_table`,`attributedata`.`foreign_id` AS `foreign_id`,`attributedata`.`value` AS `attribute_value` from ((`attributedata` left join `datasets` on((`attributedata`.`foreign_id` = `datasets`.`id`))) left join `attributes` on((`attributes`.`id` = `attributedata`.`attribute_id`))) where (`attributes`.`target_table` = 'datasets');

DROP VIEW IF EXISTS `view_table_institutions`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_institutions` AS select `institutions`.`id` AS `institution_id`,`institutions`.`name` AS `institution_name`,`institutions`.`acronym` AS `institution_acronym`,`institutions`.`address` AS `institution_address`,`institutions`.`email` AS `institution_email`,`institutions`.`contact` AS `institution_contact`,`institutions`.`phone` AS `institution_phone`,`countries`.`id` AS `country_id`,`countries`.`country_name` AS `country_name`,`countries`.`country_code2` AS `country_code` from (`institutions` left join `countries` on((`countries`.`id` = `institutions`.`country_id`)));

DROP PROCEDURE IF EXISTS `export_trials_data`;
CREATE PROCEDURE `export_trials_data` (IN groupIds TEXT, IN markedIds TEXT, IN datasetIds TEXT, IN phenotypeIds TEXT) BEGIN SET @SQL = NULL; SET @@group_concat_max_len = 64000000; SET @QRY = CONCAT(' SELECT GROUP_CONCAT(DISTINCT CONCAT("MAX(IF(`phenotype_id` = ", `phenotype_id`,",phenotype_value,NULL)) AS ", "`", CONCAT(phenotypes.`name`, IF(ISNULL(phenotypes.unit_id), "", CONCAT(" [", units.unit_abbreviation, "]"))), "`")) INTO @SQL FROM phenotypedata LEFT JOIN phenotypes ON phenotypes.id = phenotypedata.phenotype_id LEFT JOIN germinatebase ON germinatebase.id = phenotypedata.germinatebase_id LEFT JOIN units ON units.id = phenotypes.unit_id WHERE phenotypedata.dataset_id IN (', datasetIds, ') AND ', IF(phenotypeIds IS NULL, '1=1', CONCAT('phenotype_id IN (', phenotypeIds, ')'))); PREPARE stmtone FROM @QRY; EXECUTE stmtone; DEALLOCATE PREPARE stmtone; IF @SQL IS NULL THEN SELECT NULL as ERROR; ELSE SET @SQL = CONCAT(' SELECT germinatebase.name, datasets.name AS dataset_name, datasets.description AS dataset_description, datasets.version AS dataset_version, licenses.name AS license_name, ( SELECT site_name FROM locations WHERE locations.id = datasets.location_id ) AS location_name, ( SELECT site_name FROM locations WHERE locations.id = phenotypedata.location_id ) AS trial_site, DATE_FORMAT(phenotypedata.recording_date, \'%Y\') AS year, DATE_FORMAT(phenotypedata.recording_date, \'%Y-%m-%d\') AS Date, germinatebase.id AS dbId, germinatebase.general_identifier, treatments.description AS treatments_description, ', @SQL,' FROM phenotypedata LEFT JOIN germinatebase ON germinatebase.id = phenotypedata.germinatebase_id ', IF (groupIds IS NULL, '', 'LEFT JOIN groupmembers ON germinatebase.id = groupmembers.foreign_id') ,' LEFT JOIN datasets ON datasets.id = phenotypedata.dataset_id LEFT JOIN licenses ON licenses.id = datasets.license_id LEFT JOIN treatments ON treatments.id = phenotypedata.treatment_id WHERE (', IF(groupIds IS NULL AND markedIds IS NULL, '1=1', IF(groupIds IS NULL AND NOT(markedIds IS NULL), CONCAT('germinatebase.id IN (', markedIds, ')'), IF(markedIds IS NULL AND NOT(groupIds IS NULL), CONCAT('groupmembers.group_id IN (', groupIds, ')'), CONCAT('germinatebase.id IN (', markedIds, ') OR groupmembers.group_id IN (', groupIds, ')')))), ') AND datasets.id IN (', datasetIds, ') GROUP BY germinatebase.id, treatment_id, dataset_id, phenotypedata.location_id, recording_date, year'); PREPARE stmt FROM @SQL; EXECUTE stmt; DEALLOCATE PREPARE stmt; END IF; END;

DROP PROCEDURE IF EXISTS `export_compound_data`;
CREATE PROCEDURE `export_compound_data` (IN groupIds TEXT, IN markedIds TEXT, IN datasetIds TEXT, IN compoundIds TEXT) BEGIN SET @SQL = NULL; SET @@group_concat_max_len = 64000000; SET @QRY = CONCAT(' SELECT GROUP_CONCAT(DISTINCT CONCAT("MAX(IF(`compound_id` = ", `compound_id`, ",compound_value, NULL)) AS ", "`", CONCAT(compounds.`name`, IF(ISNULL(compounds.unit_id), "", CONCAT(" [", units.unit_abbreviation, "]"))), "`")) INTO @SQL FROM compounddata LEFT JOIN compounds ON compounds.id = compounddata.compound_id LEFT JOIN germinatebase ON germinatebase.id = compounddata.germinatebase_id LEFT JOIN units ON units.id = compounds.unit_id WHERE compounddata.dataset_id IN (', datasetIds, ') AND ', IF(compoundIds IS NULL, '1=1', CONCAT('compound_id IN (', compoundIds, ')'))); PREPARE stmtone FROM @QRY; EXECUTE stmtone; DEALLOCATE PREPARE stmtone; IF @SQL IS NULL THEN SELECT NULL as ERROR; ELSE SET @SQL = CONCAT(' SELECT germinatebase.name, datasets.name AS dataset_name, datasets.description AS dataset_description, datasets.version AS dataset_version, licenses.name AS license_name, germinatebase.id AS dbId, germinatebase.general_identifier, ', @SQL,' FROM compounddata LEFT JOIN germinatebase ON germinatebase.id = compounddata.germinatebase_id ', IF (groupIds IS NULL, '', 'LEFT JOIN groupmembers ON germinatebase.id = groupmembers.foreign_id') ,' LEFT JOIN datasets ON datasets.id = compounddata.dataset_id LEFT JOIN licenses ON licenses.id = datasets.license_id WHERE datasets.id IN (', datasetIds, ') AND (', IF(groupIds IS NULL AND markedIds IS NULL, '1=1', IF(groupIds IS NULL AND NOT(markedIds IS NULL), CONCAT('germinatebase.id IN (', markedIds, ')'), IF(markedIds IS NULL AND NOT(groupIds IS NULL), CONCAT('groupmembers.group_id IN (', groupIds, ')'), CONCAT('germinatebase.id IN (', markedIds, ') OR groupmembers.group_id IN (', groupIds, ')')))), ') GROUP BY germinatebase.id, dataset_id'); PREPARE stmt FROM @SQL; EXECUTE stmt; DEALLOCATE PREPARE stmt; END IF; END;

DROP PROCEDURE IF EXISTS `dataset_meta`;
CREATE PROCEDURE `dataset_meta` () BEGIN DELETE FROM datasetmeta WHERE NOT EXISTS (SELECT 1 FROM datasets WHERE datasets.is_external = 1 AND datasets.id = datasetmeta.dataset_id); SELECT @max := IFNULL(MAX(id)+1, 1) FROM datasetmeta; SET @alter_statement = concat('ALTER TABLE `datasetmeta` AUTO_INCREMENT = ', @max); PREPARE stmt FROM @alter_statement; EXECUTE stmt; DEALLOCATE PREPARE stmt; INSERT INTO datasetmeta (dataset_id, nr_of_data_points, nr_of_data_objects) SELECT datasets.id, ( COALESCE(ac.c,0) + COALESCE (pc.c, 0) + COALESCE (cc.c, 0) + COALESCE(cmc.c, 0)) AS 'nr_of_data_points', ( COALESCE (ad.d, 0) + COALESCE (pd.d, 0) + COALESCE (cd.d, 0) + COALESCE(cmd.d, 0)) AS 'nr_of_data_objects' FROM datasets LEFT JOIN datasetstates ON datasetstates.id = datasets.dataset_state_id LEFT JOIN experiments ON experiments.id = datasets.experiment_id LEFT JOIN experimenttypes ON experimenttypes.id = experiments.experiment_type_id LEFT JOIN ( SELECT dataset_id, COUNT(1) AS d FROM datasetmembers WHERE datasetmembers.datasetmembertype_id = 2 GROUP BY dataset_id ) ad ON ad.dataset_id = datasets.id LEFT JOIN ( SELECT dataset_id, COUNT(1) AS c FROM phenotypedata GROUP BY dataset_id ) pc ON pc.dataset_id = datasets.id LEFT JOIN ( SELECT dataset_id, COUNT(1) AS c FROM climatedata GROUP BY dataset_id ) cc ON cc.dataset_id = datasets.id LEFT JOIN ( SELECT dataset_id, COUNT(1) AS c FROM compounddata GROUP BY dataset_id ) cmc ON cmc.dataset_id = datasets.id LEFT JOIN (SELECT datasetmembers.dataset_id, a.count * m.count AS c FROM datasetmembers LEFT JOIN ( SELECT dataset_id, COUNT(1) AS count FROM datasetmembers WHERE datasetmembertype_id = 1 GROUP BY dataset_id ) a ON a.dataset_id = datasetmembers.dataset_id LEFT JOIN ( SELECT dataset_id, COUNT(1) AS count FROM datasetmembers WHERE datasetmembertype_id = 2 GROUP BY dataset_id ) m ON m.dataset_id = datasetmembers.dataset_id GROUP BY datasetmembers.dataset_id) ac ON ac.dataset_id = datasets.id LEFT JOIN ( SELECT distinct_entries.dataset_id, count(1) AS d FROM ( SELECT DISTINCT dataset_id, germinatebase_id FROM phenotypedata ) AS distinct_entries GROUP BY distinct_entries.dataset_id ) pd ON pd.dataset_id = datasets.id LEFT JOIN ( SELECT distinct_entries.dataset_id, count(1) AS d FROM ( SELECT DISTINCT dataset_id, location_id FROM climatedata ) AS distinct_entries GROUP BY distinct_entries.dataset_id ) cd ON cd.dataset_id = datasets.id LEFT JOIN ( SELECT distinct_entries.dataset_id, count(1) AS d FROM ( SELECT DISTINCT dataset_id, germinatebase_id FROM compounddata ) AS distinct_entries GROUP BY distinct_entries.dataset_id ) cmd ON cmd.dataset_id = datasets.id WHERE is_external = 0; END;

CREATE TABLE `dataset_export_jobs`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(36) NOT NULL,
  `job_id` text NOT NULL,
  `user_id` int(11) NULL,
  `status` enum('waiting','running','failed','completed','cancelled') NOT NULL DEFAULT 'waiting',
  `visibility` tinyint(1) NOT NULL DEFAULT 1,
  `experiment_type_id` int(11) NULL,
  `dataset_ids` json NULL,
  `created_on` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `updated_on` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`),
  FOREIGN KEY (`experiment_type_id`) REFERENCES `experimenttypes` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
);

SET FOREIGN_KEY_CHECKS=1;