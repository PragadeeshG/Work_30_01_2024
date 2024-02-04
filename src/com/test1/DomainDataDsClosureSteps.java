package com.test1;

public class DomainDataDsClosureSteps {
	private Integer crId;
	private String colosureParams;
	private String workFlowStat;
	private String onlyChecker;
	private String underQueue;
	private String queueGroup;
	private String grpCategory;
	private String startAction;
	private String endAction;
	private String startTime;
	private String endTime;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DomainDataDsClosureSteps() {

	}

	public DomainDataDsClosureSteps(Integer crId, String colosureParams, String workFlowStat, String onlyChecker,
			String underQueue, String queueGroup, String grpCategory, String startAction, String endAction,
			String startTime, String endTime, String creationDate, String modifiedDate, String entityState) {
		super();
		this.crId = crId;
		this.colosureParams = colosureParams;
		this.workFlowStat = workFlowStat;
		this.onlyChecker = onlyChecker;
		this.underQueue = underQueue;
		this.queueGroup = queueGroup;
		this.grpCategory = grpCategory;
		this.startAction = startAction;
		this.endAction = endAction;
		this.startTime = startTime;
		this.endTime = endTime;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCrId() {
		return crId;
	}

	public void setCrId(Integer crId) {
		this.crId = crId;
	}

	public String getColosureParams() {
		return colosureParams;
	}

	public void setColosureParams(String colosureParams) {
		this.colosureParams = colosureParams;
	}

	public String getWorkFlowStat() {
		return workFlowStat;
	}

	public void setWorkFlowStat(String workFlowStat) {
		this.workFlowStat = workFlowStat;
	}

	public String getOnlyChecker() {
		return onlyChecker;
	}

	public void setOnlyChecker(String onlyChecker) {
		this.onlyChecker = onlyChecker;
	}

	public String getUnderQueue() {
		return underQueue;
	}

	public void setUnderQueue(String underQueue) {
		this.underQueue = underQueue;
	}

	public String getQueueGroup() {
		return queueGroup;
	}

	public void setQueueGroup(String queueGroup) {
		this.queueGroup = queueGroup;
	}

	public String getGrpCategory() {
		return grpCategory;
	}

	public void setGrpCategory(String grpCategory) {
		this.grpCategory = grpCategory;
	}

	public String getStartAction() {
		return startAction;
	}

	public void setStartAction(String startAction) {
		this.startAction = startAction;
	}

	public String getEndAction() {
		return endAction;
	}

	public void setEndAction(String endAction) {
		this.endAction = endAction;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
