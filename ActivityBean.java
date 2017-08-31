package net.thrymr.beans;

import java.util.List;

import net.thrymr.mongo.models.UserActivityType;

public class ActivityBean {

	public List<UserActivityBean> userActivityBeans;

	public List<UserActivityType> userActivityTypes;

	public List<AppUserBean> appUserBeans;

	public List<SMSActivityBean> smsActivityBeans;

	public List<EmailActivityBean>  emailActivityBeans;

	public Integer totalPages;

	public Long totalElements;

	public Integer recordPerPage;

	public Integer startUserCount;

	public Integer endUserCount;

}
