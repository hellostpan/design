package cn.stpan.design.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 作者：stpan
 * 创建时间：2017/3/20 18:05
 * 功能：
 */
@Entity
@Table(name = "card_history", schema = "design")
public class CardHistory {
    private int id;
    private Integer cardId;
    private String phoneNumber;
    private Timestamp modifyTime;
    private Integer reserveOne;
    private Integer reserveTwo;
    private String reserveThree;
    private String reserveFour;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "phone_number", nullable = true, length = 32)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

}
