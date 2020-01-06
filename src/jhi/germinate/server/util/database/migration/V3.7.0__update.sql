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

INSERT INTO `groups` (`name`, `description`, `visibility`, `grouptype_id`) SELECT `name`, `name`, 1, 1 FROM `megaenvironments`;

INSERT INTO `groupmembers` (`foreign_id`, `group_id`) SELECT `location_id`, (SELECT `id` FROM `groups` WHERE `groups`.`name` = `megaenvironments`.`name`) FROM `megaenvironmentdata` LEFT JOIN `megaenvironments` ON `megaenvironmentdata`.`megaenvironment_id` = `megaenvironments`.`id` WHERE `megaenvironmentdata`.`is_final` = 1;

DROP TABLE `megaenvironmentdata`;
DROP TABLE `megaenvironments`;
DROP TABLE `megaenvironmentsource`;

ALTER TABLE `climatedata` CHANGE COLUMN `recording_date` `old_recording_date` varchar(32) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT 'The month that the data was recorded. This uses an integer to represent the month (1-12).' AFTER `dataset_id`;
ALTER TABLE `climatedata` ADD COLUMN `recording_date` datetime(0) NULL COMMENT 'The date at which this data point was recorded.' AFTER `dataset_id`;
UPDATE `climatedata` SET `recording_date` = STR_TO_DATE(CONCAT(YEAR(CURDATE()), '-', LPAD(`old_recording_date`,2 , '00'), '-01'), '%Y-%m-%d');

ALTER TABLE `climatedata` ADD INDEX `climate_query_index`(`climate_id`, `location_id`, `recording_date`, `dataset_id`, `climate_value`);

SET FOREIGN_KEY_CHECKS=1;