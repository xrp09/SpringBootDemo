package com.xrp09.demo.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "page_info")
public class PageInfo {
    @Id
    @Column(name = "page_id")
    private String pageId;

    @Column(name = "trade_id")
    private String tradeId;

    @Column(name = "page_num")
    private String pageNum;

    @Column(name = "page_name")
    private String pageName;

    @Column(name = "page_start_time")
    private Date pageStartTime;

    @Column(name = "page_end_time")
    private Date pageEndTime;

    @Column(name = "page_duration")
    private BigDecimal pageDuration;

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
     * @return trade_id
     */
    public String getTradeId() {
        return tradeId;
    }

    /**
     * @param tradeId
     */
    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * @return page_num
     */
    public String getPageNum() {
        return pageNum;
    }

    /**
     * @param pageNum
     */
    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * @return page_name
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * @param pageName
     */
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    /**
     * @return page_start_time
     */
    public Date getPageStartTime() {
        return pageStartTime;
    }

    /**
     * @param pageStartTime
     */
    public void setPageStartTime(Date pageStartTime) {
        this.pageStartTime = pageStartTime;
    }

    /**
     * @return page_end_time
     */
    public Date getPageEndTime() {
        return pageEndTime;
    }

    /**
     * @param pageEndTime
     */
    public void setPageEndTime(Date pageEndTime) {
        this.pageEndTime = pageEndTime;
    }

    /**
     * @return page_duration
     */
    public BigDecimal getPageDuration() {
        return pageDuration;
    }

    /**
     * @param pageDuration
     */
    public void setPageDuration(BigDecimal pageDuration) {
        this.pageDuration = pageDuration;
    }
}