package cn.k12soft.servo.domain.enumeration;

import org.springframework.security.core.GrantedAuthority;

public enum Permission implements GrantedAuthority {
  ALL,

  SCHOOL_VIEW,
  SCHOOL_CREATE,
  SCHOOL_UPDATE,
  SCHOOL_DELETE,

  GRADE_GET,
  GRADE_POST,
  GRADE_PUT,

  KLASS_GET,
  KLASS_POST,
  KLASS_PUT,
  KLASS_DELETE,

  STUDENT_VIEW,
  STUDENT_CREATE,
  STUDENT_UPDATE,
  STUDENT_DELETE,

  ROLE_GET,
  ROLE_POST,
  ROLE_PUT,
  ROLE_DELETE,

  TEACHER_GET,
  TEACHER_POST,
  TEACHER_DELETE,

  TEACHING_GET,
  TEACHING_POST,
  TEACHING_DELETE,

  KLASS_FEED_POST,
  KLASS_FEED_DELETE,
  KLASS_FEED_GET,


  GUARDIAN_POST,

  KLASS_PLAN_GET,
  KLASS_PLAN_POST,
  KLASS_PLAN_PUT,
  KLASS_PLAN_DELETE,

  COURSE_GET,
  COURSE_POST,
  COURSE_PUT,
  COURSE_DELETE,

  ALIYUN_STS_TOKEN,
  COOKBOOK_CREATE,
  COOKBOOK_VIEW,
  COOKBOOK_PUT,
  COOKBOOK_DELETE,
  GUARDIAN_VIEW,
  GUARDIAN_DELETE,

  NEWS_CREATE,
  NEWS_VIEW,
  NEWS_PUT,
  NEWS_DELETE,

  INTEREST_KLASS_GET,
  INTEREST_KLASS_POST,
  INTEREST_KLASS_PUT,
  INTEREST_KLASS_DELETE,

  CHARGE_PLAN_CREATE, // 创建收费计划
  CHARGE_PLAN_GET, //  查询收费计划
  CHARGE_PLAN_PUT,
  CHARGE_PLAN_DELETE,

  MARQUEE_CREATE,
  MARQUEE_VIEW,
  MARQUEE_PUT,
  MARQUEE_DELETE,

  HKDEVICE_CREATE,
  HKDEVICE_VIEW,
  HKDEVICE_PUT,
  HKDEVICE_DELETE,

  ALIPAY_POST,
  ALIPAY_VIEW,

  MANAGER_POST;


  @Override
  public String getAuthority() {
    return name();
  }
}
