package com.test1;

public class ModifyDomainDataDs {
	private Integer actionId;
	private String actionName;
	private boolean amendType;
	private String closeType;
	private long noDraftCount;
	private Boolean sellIndicator;
	private String workflowname;
	private String draftName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ModifyDomainDataDs() {

	}

	public ModifyDomainDataDs(Integer actionId, String actionName, boolean amendType, String closeType,
			long noDraftCount, Boolean sellIndicator, String workflowname, String draftName, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.actionId = actionId;
		this.actionName = actionName;
		this.amendType = amendType;
		this.closeType = closeType;
		this.noDraftCount = noDraftCount;
		this.sellIndicator = sellIndicator;
		this.workflowname = workflowname;
		this.draftName = draftName;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public boolean isAmendType() {
		return amendType;
	}

	public void setAmendType(boolean amendType) {
		this.amendType = amendType;
	}

	public String getCloseType() {
		return closeType;
	}

	public void setCloseType(String closeType) {
		this.closeType = closeType;
	}

	public long getNoDraftCount() {
		return noDraftCount;
	}

	public void setNoDraftCount(long noDraftCount) {
		this.noDraftCount = noDraftCount;
	}

	public Boolean getSellIndicator() {
		return sellIndicator;
	}

	public void setSellIndicator(Boolean sellIndicator) {
		this.sellIndicator = sellIndicator;
	}

	public String getWorkflowname() {
		return workflowname;
	}

	public void setWorkflowname(String workflowname) {
		this.workflowname = workflowname;
	}

	public String getDraftName() {
		return draftName;
	}

	public void setDraftName(String draftName) {
		this.draftName = draftName;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
