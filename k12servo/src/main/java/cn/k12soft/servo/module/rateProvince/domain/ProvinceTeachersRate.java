package cn.k12soft.servo.module.rateProvince.domain;

import cn.k12soft.servo.module.zone.domain.Provinces;
import cn.k12soft.servo.module.zone.domain.Regions;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.Instant;

@Entity
@DynamicUpdate
public class ProvinceTeachersRate {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Provinces provinces;
    private Integer regionsId;
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
    private Instant createdAt;

    public ProvinceTeachersRate(){}

    public ProvinceTeachersRate(Provinces provinces, Integer regionsId, String january, String february, String march, String april, String may, String june, String july, String auguest, String september, String october, String november, String december, Instant createdAt) {
        this.provinces = provinces;
        this.regionsId = regionsId;
        this.january = january;
        this.february = february;
        this.march = march;
        this.april = april;
        this.may = may;
        this.june = june;
        this.july = july;
        this.auguest = auguest;
        this.september = september;
        this.october = october;
        this.november = november;
        this.december = december;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Provinces getProvinces() {
        return provinces;
    }

    public void setProvinces(Provinces provinces) {
        this.provinces = provinces;
    }

    public Integer getRegionsId() {
        return regionsId;
    }

    public void setRegionsId(Integer regionsId) {
        this.regionsId = regionsId;
    }

    public String getJanuary() {
        return january;
    }

    public void setJanuary(String january) {
        this.january = january;
    }

    public String getFebruary() {
        return february;
    }

    public void setFebruary(String february) {
        this.february = february;
    }

    public String getMarch() {
        return march;
    }

    public void setMarch(String march) {
        this.march = march;
    }

    public String getApril() {
        return april;
    }

    public void setApril(String april) {
        this.april = april;
    }

    public String getMay() {
        return may;
    }

    public void setMay(String may) {
        this.may = may;
    }

    public String getJune() {
        return june;
    }

    public void setJune(String june) {
        this.june = june;
    }

    public String getJuly() {
        return july;
    }

    public void setJuly(String july) {
        this.july = july;
    }

    public String getAuguest() {
        return auguest;
    }

    public void setAuguest(String auguest) {
        this.auguest = auguest;
    }

    public String getSeptember() {
        return september;
    }

    public void setSeptember(String september) {
        this.september = september;
    }

    public String getOctober() {
        return october;
    }

    public void setOctober(String october) {
        this.october = october;
    }

    public String getNovember() {
        return november;
    }

    public void setNovember(String november) {
        this.november = november;
    }

    public String getDecember() {
        return december;
    }

    public void setDecember(String december) {
        this.december = december;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
