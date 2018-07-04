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

public class PIStreamUpdatesRegister {
	@SerializedName("Status")
	private String status = null;

	@SerializedName("Source")
	private String source = null;

	@SerializedName("SourceName")
	private String sourceName = null;

	@SerializedName("SourcePath")
	private String sourcePath = null;

	@SerializedName("LatestMarker")
	private String latestMarker = null;

	@SerializedName("Exception")
	private PIErrors exception = null;

	public PIStreamUpdatesRegister() {
	}


	public void setStatus(String status) { this.status = status;}

	public String getStatus() { return this.status;}

	public void setSource(String source) { this.source = source;}

	public String getSource() { return this.source;}

	public void setSourceName(String sourceName) { this.sourceName = sourceName;}

	public String getSourceName() { return this.sourceName;}

	public void setSourcePath(String sourcePath) { this.sourcePath = sourcePath;}

	public String getSourcePath() { return this.sourcePath;}

	public void setLatestMarker(String latestMarker) { this.latestMarker = latestMarker;}

	public String getLatestMarker() { return this.latestMarker;}

	public void setException(PIErrors exception) { this.exception = exception;}

	public PIErrors getException() { return this.exception;}
}
