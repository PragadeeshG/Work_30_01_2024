package com.test1;

public class DomainDataDsClosure {
	private Integer crId;
	private String refName;
	private String closeRoute;
	private Boolean onlyMaker;
	private Boolean onlyChecker;
	private Boolean deleteOnSuccess;
	private Boolean autoApproval;
	private Integer autoApprovalStep;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DomainDataDsClosure() {

	}

	public DomainDataDsClosure(Integer crId, String refName, String closeRoute, Boolean onlyMaker, Boolean onlyChecker,
			Boolean deleteOnSuccess, Boolean autoApproval, Integer autoApprovalStep, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.crId = crId;
		this.refName = refName;
		this.closeRoute = closeRoute;
		this.onlyMaker = onlyMaker;
		this.onlyChecker = onlyChecker;
		this.deleteOnSuccess = deleteOnSuccess;
		this.autoApproval = autoApproval;
		this.autoApprovalStep = autoApprovalStep;
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

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getCloseRoute() {
		return closeRoute;
	}

	public void setCloseRoute(String closeRoute) {
		this.closeRoute = closeRoute;
	}

	public Boolean getOnlyMaker() {
		return onlyMaker;
	}

	public void setOnlyMaker(Boolean onlyMaker) {
		this.onlyMaker = onlyMaker;
	}

	public Boolean getOnlyChecker() {
		return onlyChecker;
	}

	public void setOnlyChecker(Boolean onlyChecker) {
		this.onlyChecker = onlyChecker;
	}

	public Boolean getDeleteOnSuccess() {
		return deleteOnSuccess;
	}

	public void setDeleteOnSuccess(Boolean deleteOnSuccess) {
		this.deleteOnSuccess = deleteOnSuccess;
	}

	public Boolean getAutoApproval() {
		return autoApproval;
	}

	public void setAutoApproval(Boolean autoApproval) {
		this.autoApproval = autoApproval;
	}

	public Integer getAutoApprovalStep() {
		return autoApprovalStep;
	}

	public void setAutoApprovalStep(Integer autoApprovalStep) {
		this.autoApprovalStep = autoApprovalStep;
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
