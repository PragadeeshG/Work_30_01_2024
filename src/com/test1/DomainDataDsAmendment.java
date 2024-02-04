package com.test1;

public class DomainDataDsAmendment {
	private Integer crId;
	private String refName;
	private String amendRoute;
	private Boolean routeActive;
	private String routeName;
	private Integer routeType;
	private Boolean autoApproval;
	private Integer autoApprovalStep;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DomainDataDsAmendment() {

	}

	public DomainDataDsAmendment(Integer crId, String refName, String amendRoute, Boolean routeActive, String routeName,
			Integer routeType, Boolean autoApproval, Integer autoApprovalStep, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.crId = crId;
		this.refName = refName;
		this.amendRoute = amendRoute;
		this.routeActive = routeActive;
		this.routeName = routeName;
		this.routeType = routeType;
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

	public String getAmendRoute() {
		return amendRoute;
	}

	public void setAmendRoute(String amendRoute) {
		this.amendRoute = amendRoute;
	}

	public Boolean getRouteActive() {
		return routeActive;
	}

	public void setRouteActive(Boolean routeActive) {
		this.routeActive = routeActive;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Integer getRouteType() {
		return routeType;
	}

	public void setRouteType(Integer routeType) {
		this.routeType = routeType;
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
