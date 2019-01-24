package com.xrp09.demo.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

public class Ates1 {
    @Id
    @Column(name = "control_id")
    private Integer controlId;

    @Column(name = "page_id")
    private String pageId;

    @Column(name = "control_num")
    private String controlNum;

    @Column(name = "control_type")
    private String controlType;

    @Column(name = "control_code")
    private String controlCode;

    @Column(name = "control_name")
    private String controlName;

    @Column(name = "control_value")
    private String controlValue;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "event_desc")
    private String eventDesc;

    @Column(name = "handle_duration")
    private BigDecimal handleDuration;

    /**
     * @return control_id
     */
    public Integer getControlId() {
        return controlId;
    }

    /**
     * @param controlId
     */
    public void setControlId(Integer controlId) {
        this.controlId = controlId;
    }

    /**
     * @return page_id
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * @param pageId
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * @return control_num
     */
    public String getControlNum() {
        return controlNum;
    }

    /**
     * @param controlNum
     */
    public void setControlNum(String controlNum) {
        this.controlNum = controlNum;
    }

    /**
     * @return control_type
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * @param controlType
     */
    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /**
     * @return control_code
     */
    public String getControlCode() {
        return controlCode;
    }

    /**
     * @param controlCode
     */
    public void setControlCode(String controlCode) {
        this.controlCode = controlCode;
    }

    /**
     * @return control_name
     */
    public String getControlName() {
        return controlName;
    }

    /**
     * @param controlName
     */
    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    /**
     * @return control_value
     */
    public String getControlValue() {
        return controlValue;
    }

    /**
     * @param controlValue
     */
    public void setControlValue(String controlValue) {
        this.controlValue = controlValue;
    }

    /**
     * @return event_type
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return event_desc
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * @param eventDesc
     */
    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    /**
     * @return handle_duration
     */
    public BigDecimal getHandleDuration() {
        return handleDuration;
    }

    /**
     * @param handleDuration
     */
    public void setHandleDuration(BigDecimal handleDuration) {
        this.handleDuration = handleDuration;
    }
}