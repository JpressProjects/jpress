package io.jpress.module.route.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTGroup<M extends BaseTGroup<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setRouteId(java.lang.Long routeId) {
		set("route_id", routeId);
	}
	
	public java.lang.Long getRouteId() {
		return getLong("route_id");
	}

	public void setLeaveDate(java.util.Date leaveDate) {
		set("leave_date", leaveDate);
	}
	
	public java.util.Date getLeaveDate() {
		return get("leave_date");
	}

	public void setDeadlineDate(java.util.Date deadlineDate) {
		set("deadline_date", deadlineDate);
	}
	
	public java.util.Date getDeadlineDate() {
		return get("deadline_date");
	}

	public void setAdultNum(java.lang.Integer adultNum) {
		set("adult_num", adultNum);
	}
	
	public java.lang.Integer getAdultNum() {
		return getInt("adult_num");
	}

	public void setChildNum(java.lang.Integer childNum) {
		set("child_num", childNum);
	}
	
	public java.lang.Integer getChildNum() {
		return getInt("child_num");
	}

	public void setPrice(java.lang.Integer price) {
		set("price", price);
	}
	
	public java.lang.Integer getPrice() {
		return getInt("price");
	}

	public void setChildPrice(java.lang.Integer childPrice) {
		set("child_price", childPrice);
	}
	
	public java.lang.Integer getChildPrice() {
		return getInt("child_price");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setIsCalendar(java.lang.Integer isCalendar) {
		set("is_calendar", isCalendar);
	}
	
	public java.lang.Integer getIsCalendar() {
		return getInt("is_calendar");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

	public void setCost(java.lang.Integer cost) {
		set("cost", cost);
	}
	
	public java.lang.Integer getCost() {
		return getInt("cost");
	}

	public void setMarketPrice(java.lang.Integer marketPrice) {
		set("market_price", marketPrice);
	}
	
	public java.lang.Integer getMarketPrice() {
		return getInt("market_price");
	}

}