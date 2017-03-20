package cn.stpan.design.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 作者：stpan
 * 创建时间：2017/3/20 18:05
 * 功能：
 */
@Entity
@Table(name = "card_part", schema = "design")
public class CardPart {
    private int id;
    private String selId;
    private Integer cardId;
    private Integer leftPosition;
    private Integer topPosition;
    private Integer width;
    private Integer height;
    private BigDecimal lineHeight;
    private BigDecimal scale;
    private Integer bold;
    private Integer italic;
    private Integer front;
    private String content;
    private String fontFamily;
    private String fontColor;
    private String path;
    private String type;
    private Integer fontSize;
    private Timestamp modifyTime;
    private Integer editable;
    private String fieldName;
    private String formatNo;
    private BigDecimal letterSpacing;
    private Integer reserveOne;
    private Integer reserveTwo;
    private String reserveThree;
    private String reserveFour;
    private Integer align;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sel_id", nullable = true, length = 50)
    public String getSelId() {
        return selId;
    }

    public void setSelId(String selId) {
        this.selId = selId;
    }

    @Basic
    @Column(name = "card_id", nullable = true)
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "left_position", nullable = true)
    public Integer getLeftPosition() {
        return leftPosition;
    }

    public void setLeftPosition(Integer leftPosition) {
        this.leftPosition = leftPosition;
    }

    @Basic
    @Column(name = "top_position", nullable = true)
    public Integer getTopPosition() {
        return topPosition;
    }

    public void setTopPosition(Integer topPosition) {
        this.topPosition = topPosition;
    }

    @Basic
    @Column(name = "width", nullable = true)
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height", nullable = true)
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Basic
    @Column(name = "line_height", nullable = true, precision = 1)
    public BigDecimal getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(BigDecimal lineHeight) {
        this.lineHeight = lineHeight;
    }

    @Basic
    @Column(name = "scale", nullable = true, precision = 2)
    public BigDecimal getScale() {
        return scale;
    }

    public void setScale(BigDecimal scale) {
        this.scale = scale;
    }

    @Basic
    @Column(name = "bold", nullable = true)
    public Integer getBold() {
        return bold;
    }

    public void setBold(Integer bold) {
        this.bold = bold;
    }

    @Basic
    @Column(name = "italic", nullable = true)
    public Integer getItalic() {
        return italic;
    }

    public void setItalic(Integer italic) {
        this.italic = italic;
    }

    @Basic
    @Column(name = "front", nullable = true)
    public Integer getFront() {
        return front;
    }

    public void setFront(Integer front) {
        this.front = front;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 500)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "font_family", nullable = true, length = 24)
    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    @Basic
    @Column(name = "font_color", nullable = true, length = 10)
    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    @Basic
    @Column(name = "path", nullable = true, length = 100)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 2)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "font_size", nullable = true)
    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
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
    @Column(name = "editable", nullable = true)
    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    @Basic
    @Column(name = "field_name", nullable = true, length = 32)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "format_no", nullable = true, length = 5)
    public String getFormatNo() {
        return formatNo;
    }

    public void setFormatNo(String formatNo) {
        this.formatNo = formatNo;
    }

    @Basic
    @Column(name = "letter_spacing", nullable = true, precision = 1)
    public BigDecimal getLetterSpacing() {
        return letterSpacing;
    }

    public void setLetterSpacing(BigDecimal letterSpacing) {
        this.letterSpacing = letterSpacing;
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
    @Column(name = "align", nullable = true)
    public Integer getAlign() {
        return align;
    }

    public void setAlign(Integer align) {
        this.align = align;
    }

}
