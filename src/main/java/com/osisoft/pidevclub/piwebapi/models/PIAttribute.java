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

public class PIAttribute {
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

	@SerializedName("Type")
	private String type = null;

	@SerializedName("TypeQualifier")
	private String typeQualifier = null;

	@SerializedName("DefaultUnitsName")
	private String defaultUnitsName = null;

	@SerializedName("DisplayDigits")
	private Integer displayDigits = null;

	@SerializedName("DataReferencePlugIn")
	private String dataReferencePlugIn = null;

	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("IsConfigurationItem")
	private Boolean isConfigurationItem = null;

	@SerializedName("IsExcluded")
	private Boolean isExcluded = null;

	@SerializedName("IsHidden")
	private Boolean isHidden = null;

	@SerializedName("IsManualDataEntry")
	private Boolean isManualDataEntry = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("Step")
	private Boolean step = null;

	@SerializedName("TraitName")
	private String traitName = null;

	@SerializedName("DefaultUnitsNameAbbreviation")
	private String defaultUnitsNameAbbreviation = null;

	@SerializedName("Span")
	private Double span = null;

	@SerializedName("Zero")
	private Double zero = null;

	@SerializedName("Links")
	private PIAttributeLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIAttribute() {
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

	public void setType(String type) { this.type = type;}

	public String getType() { return this.type;}

	public void setTypeQualifier(String typeQualifier) { this.typeQualifier = typeQualifier;}

	public String getTypeQualifier() { return this.typeQualifier;}

	public void setDefaultUnitsName(String defaultUnitsName) { this.defaultUnitsName = defaultUnitsName;}

	public String getDefaultUnitsName() { return this.defaultUnitsName;}

	public void setDisplayDigits(Integer displayDigits) { this.displayDigits = displayDigits;}

	public Integer getDisplayDigits() { return this.displayDigits;}

	public void setDataReferencePlugIn(String dataReferencePlugIn) { this.dataReferencePlugIn = dataReferencePlugIn;}

	public String getDataReferencePlugIn() { return this.dataReferencePlugIn;}

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString;}

	public void setIsConfigurationItem(Boolean isConfigurationItem) { this.isConfigurationItem = isConfigurationItem;}

	public Boolean getIsConfigurationItem() { return this.isConfigurationItem;}

	public void setIsExcluded(Boolean isExcluded) { this.isExcluded = isExcluded;}

	public Boolean getIsExcluded() { return this.isExcluded;}

	public void setIsHidden(Boolean isHidden) { this.isHidden = isHidden;}

	public Boolean getIsHidden() { return this.isHidden;}

	public void setIsManualDataEntry(Boolean isManualDataEntry) { this.isManualDataEntry = isManualDataEntry;}

	public Boolean getIsManualDataEntry() { return this.isManualDataEntry;}

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren;}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames;}

	public void setStep(Boolean step) { this.step = step;}

	public Boolean getStep() { return this.step;}

	public void setTraitName(String traitName) { this.traitName = traitName;}

	public String getTraitName() { return this.traitName;}

	public void setDefaultUnitsNameAbbreviation(String defaultUnitsNameAbbreviation) { this.defaultUnitsNameAbbreviation = defaultUnitsNameAbbreviation;}

	public String getDefaultUnitsNameAbbreviation() { return this.defaultUnitsNameAbbreviation;}

	public void setSpan(Double span) { this.span = span;}

	public Double getSpan() { return this.span;}

	public void setZero(Double zero) { this.zero = zero;}

	public Double getZero() { return this.zero;}

	public void setLinks(PIAttributeLinks links) { this.links = links;}

	public PIAttributeLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
