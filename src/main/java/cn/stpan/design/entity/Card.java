package cn.stpan.design.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 作者：stpan
 * 创建时间：2017/3/20 18:05
 * 功能：
 */
@Entity
@Table(name = "card", schema = "design")
public class Card {
    private int id;
    private String frontImage;
    private String backImage;
    private Timestamp modifyTime;
    private String frontBg;
    private String backBg;
    private Integer frontBgType;
    private Integer backBgType;
    private Integer frontFormatAmount;
    private Integer direction;
    private Integer template;
    private Integer onLine;
    private Integer reserveOne;
    private Integer reserveTwo;
    private String reserveThree;
    private String reserveFour;
    private Integer frontFormatChecked;
    private String cardName;
    private Integer backFormatAmount;
    private Integer backFormatChecked;
    private String frontBorderRadius;
    private String backBorderRadius;
    private String frontThumbnail;
    private String backThumbnail;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "front_image", nullable = true, length = 255)
    public String getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    @Basic
    @Column(name = "back_image", nullable = true, length = 255)
    public String getBackImage() {
        return backImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    @Basic
    @Column(name = "modify_time", nullable = true)
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "front_bg", nullable = true, length = 50)
    public String getFrontBg() {
        return frontBg;
    }

    public void setFrontBg(String frontBg) {
        this.frontBg = frontBg;
    }

    @Basic
    @Column(name = "back_bg", nullable = true, length = 50)
    public String getBackBg() {
        return backBg;
    }

    public void setBackBg(String backBg) {
        this.backBg = backBg;
    }

    @Basic
    @Column(name = "front_bg_type", nullable = true)
    public Integer getFrontBgType() {
        return frontBgType;
    }

    public void setFrontBgType(Integer frontBgType) {
        this.frontBgType = frontBgType;
    }

    @Basic
    @Column(name = "back_bg_type", nullable = true)
    public Integer getBackBgType() {
        return backBgType;
    }

    public void setBackBgType(Integer backBgType) {
        this.backBgType = backBgType;
    }

    @Basic
    @Column(name = "front_format_amount", nullable = true)
    public Integer getFrontFormatAmount() {
        return frontFormatAmount;
    }

    public void setFrontFormatAmount(Integer frontFormatAmount) {
        this.frontFormatAmount = frontFormatAmount;
    }

    @Basic
    @Column(name = "direction", nullable = true)
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "template", nullable = true)
    public Integer getTemplate() {
        return template;
    }

    public void setTemplate(Integer template) {
        this.template = template;
    }

    @Basic
    @Column(name = "on_line", nullable = true)
    public Integer getOnLine() {
        return onLine;
    }

    public void setOnLine(Integer onLine) {
        this.onLine = onLine;
    }

    @Basic
    @Column(name = "reserve_one", nullable = true)
    public Integer getReserveOne() {
        return reserveOne;
    }

    public void setReserveOne(Integer reserveOne) {
        this.reserveOne = reserveOne;
    }

    @Basic
    @Column(name = "reserve_two", nullable = true)
    public Integer getReserveTwo() {
        return reserveTwo;
    }

    public void setReserveTwo(Integer reserveTwo) {
        this.reserveTwo = reserveTwo;
    }

    @Basic
    @Column(name = "reserve_three", nullable = true, length = 32)
    public String getReserveThree() {
        return reserveThree;
    }

    public void setReserveThree(String reserveThree) {
        this.reserveThree = reserveThree;
    }

    @Basic
    @Column(name = "reserve_four", nullable = true, length = 100)
    public String getReserveFour() {
        return reserveFour;
    }

    public void setReserveFour(String reserveFour) {
        this.reserveFour = reserveFour;
    }

    @Basic
    @Column(name = "front_format_checked", nullable = true)
    public Integer getFrontFormatChecked() {
        return frontFormatChecked;
    }

    public void setFrontFormatChecked(Integer frontFormatChecked) {
        this.frontFormatChecked = frontFormatChecked;
    }

    @Basic
    @Column(name = "card_name", nullable = true, length = 32)
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Basic
    @Column(name = "back_format_amount", nullable = true)
    public Integer getBackFormatAmount() {
        return backFormatAmount;
    }

    public void setBackFormatAmount(Integer backFormatAmount) {
        this.backFormatAmount = backFormatAmount;
    }

    @Basic
    @Column(name = "back_format_checked", nullable = true)
    public Integer getBackFormatChecked() {
        return backFormatChecked;
    }

    public void setBackFormatChecked(Integer backFormatChecked) {
        this.backFormatChecked = backFormatChecked;
    }

    @Basic
    @Column(name = "front_border_radius", nullable = true, length = 50)
    public String getFrontBorderRadius() {
        return frontBorderRadius;
    }

    public void setFrontBorderRadius(String frontBorderRadius) {
        this.frontBorderRadius = frontBorderRadius;
    }

    @Basic
    @Column(name = "back_border_radius", nullable = true, length = 50)
    public String getBackBorderRadius() {
        return backBorderRadius;
    }

    public void setBackBorderRadius(String backBorderRadius) {
        this.backBorderRadius = backBorderRadius;
    }

    @Basic
    @Column(name = "front_thumbnail", nullable = true, length = 255)
    public String getFrontThumbnail() {
        return frontThumbnail;
    }

    public void setFrontThumbnail(String frontThumbnail) {
        this.frontThumbnail = frontThumbnail;
    }

    @Basic
    @Column(name = "back_thumbnail", nullable = true, length = 255)
    public String getBackThumbnail() {
        return backThumbnail;
    }

    public void setBackThumbnail(String backThumbnail) {
        this.backThumbnail = backThumbnail;
    }

}
