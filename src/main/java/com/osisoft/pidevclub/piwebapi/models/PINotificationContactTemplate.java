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

public class PINotificationContactTemplate {
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

	@SerializedName("Available")
	private Boolean available = null;

	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("ContactType")
	private String contactType = null;

	@SerializedName("PlugInName")
	private String plugInName = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("MaximumRetries")
	private Integer maximumRetries = null;

	@SerializedName("MinimumAcknowledgements")
	private Integer minimumAcknowledgements = null;

	@SerializedName("NotifyWhenInstanceEnded")
	private Boolean notifyWhenInstanceEnded = null;

	@SerializedName("EscalationTimeout")
	private String escalationTimeout = null;

	@SerializedName("RetryInterval")
	private String retryInterval = null;

	@SerializedName("Links")
	private PINotificationContactTemplateLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PINotificationContactTemplate() {
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

	public void setAvailable(Boolean available) { this.available = available;}

	public Boolean getAvailable() { return this.available;}

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString;}

	public void setContactType(String contactType) { this.contactType = contactType;}

	public String getContactType() { return this.contactType;}

	public void setPlugInName(String plugInName) { this.plugInName = plugInName;}

	public String getPlugInName() { return this.plugInName;}

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren;}

	public void setMaximumRetries(Integer maximumRetries) { this.maximumRetries = maximumRetries;}

	public Integer getMaximumRetries() { return this.maximumRetries;}

	public void setMinimumAcknowledgements(Integer minimumAcknowledgements) { this.minimumAcknowledgements = minimumAcknowledgements;}

	public Integer getMinimumAcknowledgements() { return this.minimumAcknowledgements;}

	public void setNotifyWhenInstanceEnded(Boolean notifyWhenInstanceEnded) { this.notifyWhenInstanceEnded = notifyWhenInstanceEnded;}

	public Boolean getNotifyWhenInstanceEnded() { return this.notifyWhenInstanceEnded;}

	public void setEscalationTimeout(String escalationTimeout) { this.escalationTimeout = escalationTimeout;}

	public String getEscalationTimeout() { return this.escalationTimeout;}

	public void setRetryInterval(String retryInterval) { this.retryInterval = retryInterval;}

	public String getRetryInterval() { return this.retryInterval;}

	public void setLinks(PINotificationContactTemplateLinks links) { this.links = links;}

	public PINotificationContactTemplateLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
