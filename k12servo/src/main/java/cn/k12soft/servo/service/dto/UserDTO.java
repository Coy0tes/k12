package cn.k12soft.servo.service.dto;

import cn.k12soft.servo.domain.enumeration.ActorType;
import cn.k12soft.servo.domain.enumeration.GenderType;
import java.time.Instant;
import java.util.Collection;

/**
 * @author <a href="mailto:fenghua.wng@live.com">fenghua.wang</a> Created on 2017/8/13.
 */
public class UserDTO {

  private Integer id;
  private String mobile;
  private String username;
  private String avatar;
  private String portrait;
  private GenderType gender;
  private Instant createdAt;
  private Collection<SchoolDTO> schools;
  private Collection<ActorType> actorType;
  private String token;

  public Integer getId() {
    return id;
  }

  public UserDTO setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getMobile() {
    return mobile;
  }

  public UserDTO setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public UserDTO setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getAvatar() {
    return avatar;
  }

  public UserDTO setAvatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  public String getPortrait() {
    return this.portrait;
  }

  public UserDTO setPortrait(String portrait) {
    this.portrait = portrait;
    return this;
  }

  public GenderType getGender() {
    return gender;
  }

  public UserDTO setGender(GenderType gender) {
    this.gender = gender;
    return this;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public UserDTO setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Collection<SchoolDTO> getSchools() {
    return schools;
  }

  public UserDTO setSchools(Collection<SchoolDTO> schools) {
    this.schools = schools;
    return this;
  }

  public String getToken() {
    return token;
  }

  public UserDTO setToken(String token) {
    this.token = token;
    return this;
  }

  public UserDTO setActorType(Collection<ActorType> actorType) {
    this.actorType = actorType;
    return this;
  }

  public Collection<ActorType> getActorType() {
    return actorType;
  }

  @Override
  public String toString() {
    return "UserDTO{" +
      "id=" + id +
      ", mobile='" + mobile + '\'' +
      ", username='" + username + '\'' +
      ", avatar='" + avatar + '\'' +
      ", portrait='" + portrait + '\'' +
      ", gender=" + gender +
      ", createdAt=" + createdAt +
      ", schools=" + schools +
      ", actorType=" + actorType +
      ", token='" + token + '\'' +
      '}';
  }
}
