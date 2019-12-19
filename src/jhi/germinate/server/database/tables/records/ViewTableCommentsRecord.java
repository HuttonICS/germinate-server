/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.ViewTableComments;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableCommentsRecord extends TableRecordImpl<ViewTableCommentsRecord> implements Record8<Integer, Integer, String, Integer, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = 1798665706;

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.comment_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setCommentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.comment_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getCommentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.comment_type_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setCommentTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.comment_type_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getCommentTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.comment_type</code>. This could include 'germinatebase' or 'markers' to define the table that the comment relates to.
     */
    public void setCommentType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.comment_type</code>. This could include 'germinatebase' or 'markers' to define the table that the comment relates to.
     */
    public String getCommentType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.comment_foreign_id</code>. Relates to the UID of the table to which the comment relates
     */
    public void setCommentForeignId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.comment_foreign_id</code>. Relates to the UID of the table to which the comment relates
     */
    public Integer getCommentForeignId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.user_name</code>.
     */
    public void setUserName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.user_name</code>.
     */
    public String getUserName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.comment_content</code>. The comment content.
     */
    public void setCommentContent(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.comment_content</code>. The comment content.
     */
    public String getCommentContent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_comments.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_comments.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, Integer, Integer, String, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, Integer, Integer, String, String, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.COMMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.COMMENT_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.COMMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.COMMENT_FOREIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.COMMENT_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ViewTableComments.VIEW_TABLE_COMMENTS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCommentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCommentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCommentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCommentForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCommentContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCommentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCommentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCommentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCommentForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCommentContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value1(Integer value) {
        setCommentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value2(Integer value) {
        setCommentTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value3(String value) {
        setCommentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value4(Integer value) {
        setCommentForeignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value6(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value7(String value) {
        setCommentContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCommentsRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, String value6, String value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableCommentsRecord
     */
    public ViewTableCommentsRecord() {
        super(ViewTableComments.VIEW_TABLE_COMMENTS);
    }

    /**
     * Create a detached, initialised ViewTableCommentsRecord
     */
    public ViewTableCommentsRecord(Integer commentId, Integer commentTypeId, String commentType, Integer commentForeignId, Integer userId, String userName, String commentContent, Timestamp updatedOn) {
        super(ViewTableComments.VIEW_TABLE_COMMENTS);

        set(0, commentId);
        set(1, commentTypeId);
        set(2, commentType);
        set(3, commentForeignId);
        set(4, userId);
        set(5, userName);
        set(6, commentContent);
        set(7, updatedOn);
    }
// @formatter:on
}
