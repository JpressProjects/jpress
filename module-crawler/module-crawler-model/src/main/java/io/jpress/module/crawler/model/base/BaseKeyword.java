package io.jpress.module.crawler.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseKeyword<M extends BaseKeyword<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setCategoryId(java.lang.Integer categoryId) {
		set("category_id", categoryId);
	}
	
	public java.lang.Integer getCategoryId() {
		return getInt("category_id");
	}

	public void setParentId(java.lang.Integer parentId) {
		set("parent_id", parentId);
	}
	
	public java.lang.Integer getParentId() {
		return getInt("parent_id");
	}

	public void setWebpageId(java.lang.Integer webpageId) {
		set("webpage_id", webpageId);
	}
	
	public java.lang.Integer getWebpageId() {
		return getInt("webpage_id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setNum(java.lang.Integer num) {
		set("num", num);
	}
	
	public java.lang.Integer getNum() {
		return getInt("num");
	}

	public void setPinyin(java.lang.String pinyin) {
		set("pinyin", pinyin);
	}
	
	public java.lang.String getPinyin() {
		return getStr("pinyin");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setIsBaiduEnabled(java.lang.Integer isBaiduEnabled) {
		set("is_baidu_enabled", isBaiduEnabled);
	}
	
	public java.lang.Integer getIsBaiduEnabled() {
		return getInt("is_baidu_enabled");
	}

	public void setIsSogoEnabled(java.lang.Integer isSogoEnabled) {
		set("is_sogo_enabled", isSogoEnabled);
	}
	
	public java.lang.Integer getIsSogoEnabled() {
		return getInt("is_sogo_enabled");
	}

	public void setIsSosoEnabled(java.lang.Integer isSosoEnabled) {
		set("is_soso_enabled", isSosoEnabled);
	}
	
	public java.lang.Integer getIsSosoEnabled() {
		return getInt("is_soso_enabled");
	}

	public void setIsShenmaEnabled(java.lang.Integer isShenmaEnabled) {
		set("is_shenma_enabled", isShenmaEnabled);
	}
	
	public java.lang.Integer getIsShenmaEnabled() {
		return getInt("is_shenma_enabled");
	}

	public void setIsBaiduChecked(java.lang.Integer isBaiduChecked) {
		set("is_baidu_checked", isBaiduChecked);
	}
	
	public java.lang.Integer getIsBaiduChecked() {
		return getInt("is_baidu_checked");
	}

	public void setIsSogoChecked(java.lang.Integer isSogoChecked) {
		set("is_sogo_checked", isSogoChecked);
	}
	
	public java.lang.Integer getIsSogoChecked() {
		return getInt("is_sogo_checked");
	}

	public void setIsSosoChecked(java.lang.Integer isSosoChecked) {
		set("is_soso_checked", isSosoChecked);
	}
	
	public java.lang.Integer getIsSosoChecked() {
		return getInt("is_soso_checked");
	}

	public void setIsShenmaChecked(java.lang.Integer isShenmaChecked) {
		set("is_shenma_checked", isShenmaChecked);
	}
	
	public java.lang.Integer getIsShenmaChecked() {
		return getInt("is_shenma_checked");
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
