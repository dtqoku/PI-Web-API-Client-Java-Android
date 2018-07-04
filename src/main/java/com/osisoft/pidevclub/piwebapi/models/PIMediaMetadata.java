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

public class PIMediaMetadata {
	@SerializedName("Author")
	private String author = null;

	@SerializedName("ChangeDate")
	private String changeDate = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Size")
	private Double size = null;

	@SerializedName("Links")
	private PIMediaMetadataLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIMediaMetadata() {
	}


	public void setAuthor(String author) { this.author = author;}

	public String getAuthor() { return this.author;}

	public void setChangeDate(String changeDate) { this.changeDate = changeDate;}

	public String getChangeDate() { return this.changeDate;}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setSize(Double size) { this.size = size;}

	public Double getSize() { return this.size;}

	public void setLinks(PIMediaMetadataLinks links) { this.links = links;}

	public PIMediaMetadataLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
