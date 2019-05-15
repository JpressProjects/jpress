package io.jpress.module.crawler.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWebpage<M extends BaseWebpage<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setLink(java.lang.String link) {
		set("link", link);
	}
	
	public java.lang.String getLink() {
		return getStr("link");
	}

	public void setDomain(java.lang.String domain) {
		set("domain", domain);
	}
	
	public java.lang.String getDomain() {
		return getStr("domain");
	}

	public void setSpiderId(java.lang.Integer spiderId) {
		set("spider_id", spiderId);
	}
	
	public java.lang.Integer getSpiderId() {
		return getInt("spider_id");
	}

	public void setTaskId(java.lang.Integer taskId) {
		set("task_id", taskId);
	}
	
	public java.lang.Integer getTaskId() {
		return getInt("task_id");
	}

	public void setCategory(java.lang.String category) {
		set("category", category);
	}
	
	public java.lang.String getCategory() {
		return getStr("category");
	}

	public void setRawHtml(java.lang.String rawHtml) {
		set("raw_html", rawHtml);
	}
	
	public java.lang.String getRawHtml() {
		return getStr("raw_html");
	}

	public void setKeywords(java.lang.String keywords) {
		set("keywords", keywords);
	}
	
	public java.lang.String getKeywords() {
		return getStr("keywords");
	}

	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}
	
	public java.lang.String getSummary() {
		return getStr("summary");
	}

	public void setGatherTime(java.util.Date gatherTime) {
		set("gather_time", gatherTime);
	}
	
	public java.util.Date getGatherTime() {
		return get("gather_time");
	}

	public void setPublishTime(java.util.Date publishTime) {
		set("publish_time", publishTime);
	}
	
	public java.util.Date getPublishTime() {
		return get("publish_time");
	}

	public void setEntityName(java.lang.String entityName) {
		set("entity_name", entityName);
	}
	
	public java.lang.String getEntityName() {
		return getStr("entity_name");
	}

	public void setProcessTime(java.lang.Integer processTime) {
		set("process_time", processTime);
	}
	
	public java.lang.Integer getProcessTime() {
		return getInt("process_time");
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

}
