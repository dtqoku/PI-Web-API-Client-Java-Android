/*
 *
 * Copyright 2018 OSIsoft, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   <http://www.apache.org/licenses/LICENSE-2.0>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.osisoft.pidevclub.piwebapi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.osisoft.pidevclub.piwebapi.models.*;

public class PINotificationRule {
	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("AutoCreated")
	private Boolean autoCreated = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("Criteria")
	private String criteria = null;

	@SerializedName("MultiTriggerEventOption")
	private String multiTriggerEventOption = null;

	@SerializedName("NonrepetitionInterval")
	private String nonrepetitionInterval = null;

	@SerializedName("ResendInterval")
	private String resendInterval = null;

	@SerializedName("Status")
	private String status = null;

	@SerializedName("TemplateName")
	private String templateName = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PINotificationRule() {
	}


	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId;}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description;}

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path;}

	public void setAutoCreated(Boolean autoCreated) { this.autoCreated = autoCreated;}

	public Boolean getAutoCreated() { return this.autoCreated;}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames;}

	public void setCriteria(String criteria) { this.criteria = criteria;}

	public String getCriteria() { return this.criteria;}

	public void setMultiTriggerEventOption(String multiTriggerEventOption) { this.multiTriggerEventOption = multiTriggerEventOption;}

	public String getMultiTriggerEventOption() { return this.multiTriggerEventOption;}

	public void setNonrepetitionInterval(String nonrepetitionInterval) { this.nonrepetitionInterval = nonrepetitionInterval;}

	public String getNonrepetitionInterval() { return this.nonrepetitionInterval;}

	public void setResendInterval(String resendInterval) { this.resendInterval = resendInterval;}

	public String getResendInterval() { return this.resendInterval;}

	public void setStatus(String status) { this.status = status;}

	public String getStatus() { return this.status;}

	public void setTemplateName(String templateName) { this.templateName = templateName;}

	public String getTemplateName() { return this.templateName;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
