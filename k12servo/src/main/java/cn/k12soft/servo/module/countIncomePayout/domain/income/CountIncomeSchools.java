package cn.k12soft.servo.module.countIncomePayout.domain.income;

import cn.k12soft.servo.domain.School;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.Instant;

@Entity
@DynamicUpdate
public class CountIncomeSchools {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private School school;
    private Integer cityId;
    private String january = "0.00";     // 一月
    private String february = "0.00";    // 二月
    private String march = "0.00";       // 三月
    private String april = "0.00";       // 四月
    private String may = "0.00";         // 五月
    private String june = "0.00";        // 六月
    private String july = "0.00";        // 七月
    private String auguest = "0.00";     // 八月
    private String september = "0.00";   // 九月
    private String october = "0.00";     // 十月
    private String november = "0.00";    // 十一月
    private String december = "0.00";    // 十二月
    private String count = "0.00";       // 今年从一月份到现在的汇总
    private Instant createdAt;
    private Instant updateAt;

    public Long getId() {
        return id;
    }

    public School getSchool() {
        return school;
    }

    public Integer getCityId() {
        return cityId;
    }

    public String getJanuary() {
        return january;
    }

    public String getFebruary() {
        return february;
    }

    public String getMarch() {
        return march;
    }

    public String getApril() {
        return april;
    }

    public String getMay() {
        return may;
    }

    public String getJune() {
        return june;
    }

    public String getJuly() {
        return july;
    }

    public String getAuguest() {
        return auguest;
    }

    public String getSeptember() {
        return september;
    }

    public String getOctober() {
        return october;
    }

    public String getNovember() {
        return november;
    }

    public String getDecember() {
        return december;
    }

    public String getCount() {
        return count;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setJanuary(String january) {
        this.january = january;
    }

    public void setFebruary(String february) {
        this.february = february;
    }

    public void setMarch(String march) {
        this.march = march;
    }

    public void setApril(String april) {
        this.april = april;
    }

    public void setMay(String may) {
        this.may = may;
    }

    public void setJune(String june) {
        this.june = june;
    }

    public void setJuly(String july) {
        this.july = july;
    }

    public void setAuguest(String auguest) {
        this.auguest = auguest;
    }

    public void setSeptember(String september) {
        this.september = september;
    }

    public void setOctober(String october) {
        this.october = october;
    }

    public void setNovember(String november) {
        this.november = november;
    }

    public void setDecember(String december) {
        this.december = december;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }
}
