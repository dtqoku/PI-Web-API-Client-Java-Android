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

public class PINotificationRuleSubscriber {
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

	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("ContactTemplateName")
	private String contactTemplateName = null;

	@SerializedName("ContactType")
	private String contactType = null;

	@SerializedName("DeliveryFormatName")
	private String deliveryFormatName = null;

	@SerializedName("PlugInName")
	private String plugInName = null;

	@SerializedName("EscalationTimeout")
	private String escalationTimeout = null;

	@SerializedName("MaximumRetries")
	private Integer maximumRetries = null;

	@SerializedName("NotifyOption")
	private String notifyOption = null;

	@SerializedName("RetryInterval")
	private String retryInterval = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PINotificationRuleSubscriber() {
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

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString;}

	public void setContactTemplateName(String contactTemplateName) { this.contactTemplateName = contactTemplateName;}

	public String getContactTemplateName() { return this.contactTemplateName;}

	public void setContactType(String contactType) { this.contactType = contactType;}

	public String getContactType() { return this.contactType;}

	public void setDeliveryFormatName(String deliveryFormatName) { this.deliveryFormatName = deliveryFormatName;}

	public String getDeliveryFormatName() { return this.deliveryFormatName;}

	public void setPlugInName(String plugInName) { this.plugInName = plugInName;}

	public String getPlugInName() { return this.plugInName;}

	public void setEscalationTimeout(String escalationTimeout) { this.escalationTimeout = escalationTimeout;}

	public String getEscalationTimeout() { return this.escalationTimeout;}

	public void setMaximumRetries(Integer maximumRetries) { this.maximumRetries = maximumRetries;}

	public Integer getMaximumRetries() { return this.maximumRetries;}

	public void setNotifyOption(String notifyOption) { this.notifyOption = notifyOption;}

	public String getNotifyOption() { return this.notifyOption;}

	public void setRetryInterval(String retryInterval) { this.retryInterval = retryInterval;}

	public String getRetryInterval() { return this.retryInterval;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
