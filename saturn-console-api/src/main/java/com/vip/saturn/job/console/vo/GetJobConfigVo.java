/**
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.saturn.job.console.vo;

import com.vip.saturn.job.console.domain.ExecutorProvided;
import com.vip.saturn.job.console.domain.JobConfig;
import com.vip.saturn.job.console.domain.JobStatus;
import com.vip.saturn.job.console.utils.SaturnBeanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class GetJobConfigVo {

	private String jobName;
	private String jobClass;
	private Integer shardingTotalCount;
	private String timeZone;
	private String cron;
	private List<String> pausePeriodDate;
	private List<String> pausePeriodTime;
	private String shardingItemParameters;
	private String jobParameter;
	private Integer processCountIntervalSeconds;
	private Boolean failover;
	private String description;
	private Integer timeout4AlarmSeconds;
	private Integer timeoutSeconds;
	private Boolean showNormalLog;
	private String channelName;
	private String jobType;
	private String queueName;
	private Integer loadLevel;
	private Integer jobDegree;
	private Boolean enabledReport;
	private Boolean enabled;
	private List<String> preferList;
	private Boolean onlyUsePreferList;
	private Boolean localMode;
	private Boolean useSerial;
	private String jobMode;
	// 'dependencies' is deprecated, the front web is not useful, so not transport it
	private String groups;
	private Boolean rerun;
	private List<String> upStream;
	private List<String> downStream;

	private List<String> timeZonesProvided;
	private List<ExecutorProvided> preferListProvided;
	private List<String> upStreamProvided;
	private List<String> downStreamProvided;
	private JobStatus status;

	public void copyFrom(JobConfig jobConfig) {
		SaturnBeanUtils.copyProperties(jobConfig, this);
		pausePeriodDate = toList(jobConfig.getPausePeriodDate());
		pausePeriodTime = toList(jobConfig.getPausePeriodTime());
		preferList = toList(jobConfig.getPreferList());
		Boolean useDispreferList = jobConfig.getUseDispreferList();
		if (useDispreferList != null) {
			onlyUsePreferList = !useDispreferList;
		}
		upStream = toList(jobConfig.getUpStream());
		downStream = toList(jobConfig.getDownStream());
	}

	private List<String> toList(String str) {
		List<String> list = new ArrayList<>();
		if (str != null) {
			String[] split = str.split(",");
			for (String temp : split) {
				if (StringUtils.isNotBlank(temp)) {
					list.add(temp.trim());
				}
			}
		}
		return list;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public Integer getShardingTotalCount() {
		return shardingTotalCount;
	}

	public void setShardingTotalCount(Integer shardingTotalCount) {
		this.shardingTotalCount = shardingTotalCount;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public List<String> getPausePeriodDate() {
		return pausePeriodDate;
	}

	public void setPausePeriodDate(List<String> pausePeriodDate) {
		this.pausePeriodDate = pausePeriodDate;
	}

	public List<String> getPausePeriodTime() {
		return pausePeriodTime;
	}

	public void setPausePeriodTime(List<String> pausePeriodTime) {
		this.pausePeriodTime = pausePeriodTime;
	}

	public String getShardingItemParameters() {
		return shardingItemParameters;
	}

	public void setShardingItemParameters(String shardingItemParameters) {
		this.shardingItemParameters = shardingItemParameters;
	}

	public String getJobParameter() {
		return jobParameter;
	}

	public void setJobParameter(String jobParameter) {
		this.jobParameter = jobParameter;
	}

	public Integer getProcessCountIntervalSeconds() {
		return processCountIntervalSeconds;
	}

	public void setProcessCountIntervalSeconds(Integer processCountIntervalSeconds) {
		this.processCountIntervalSeconds = processCountIntervalSeconds;
	}

	public Boolean getFailover() {
		return failover;
	}

	public void setFailover(Boolean failover) {
		this.failover = failover;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTimeout4AlarmSeconds() {
		return timeout4AlarmSeconds;
	}

	public void setTimeout4AlarmSeconds(Integer timeout4AlarmSeconds) {
		this.timeout4AlarmSeconds = timeout4AlarmSeconds;
	}

	public Integer getTimeoutSeconds() {
		return timeoutSeconds;
	}

	public void setTimeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
	}

	public Boolean getShowNormalLog() {
		return showNormalLog;
	}

	public void setShowNormalLog(Boolean showNormalLog) {
		this.showNormalLog = showNormalLog;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public Integer getLoadLevel() {
		return loadLevel;
	}

	public void setLoadLevel(Integer loadLevel) {
		this.loadLevel = loadLevel;
	}

	public Integer getJobDegree() {
		return jobDegree;
	}

	public void setJobDegree(Integer jobDegree) {
		this.jobDegree = jobDegree;
	}

	public Boolean getEnabledReport() {
		return enabledReport;
	}

	public void setEnabledReport(Boolean enabledReport) {
		this.enabledReport = enabledReport;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<String> getPreferList() {
		return preferList;
	}

	public void setPreferList(List<String> preferList) {
		this.preferList = preferList;
	}

	public Boolean getOnlyUsePreferList() {
		return onlyUsePreferList;
	}

	public void setOnlyUsePreferList(Boolean onlyUsePreferList) {
		this.onlyUsePreferList = onlyUsePreferList;
	}

	public Boolean getLocalMode() {
		return localMode;
	}

	public void setLocalMode(Boolean localMode) {
		this.localMode = localMode;
	}

	public Boolean getUseSerial() {
		return useSerial;
	}

	public void setUseSerial(Boolean useSerial) {
		this.useSerial = useSerial;
	}

	public String getJobMode() {
		return jobMode;
	}

	public void setJobMode(String jobMode) {
		this.jobMode = jobMode;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public Boolean getRerun() {
		return rerun;
	}

	public void setRerun(Boolean rerun) {
		this.rerun = rerun;
	}

	public List<String> getUpStream() {
		return upStream;
	}

	public void setUpStream(List<String> upStream) {
		this.upStream = upStream;
	}

	public List<String> getDownStream() {
		return downStream;
	}

	public void setDownStream(List<String> downStream) {
		this.downStream = downStream;
	}

	public List<String> getTimeZonesProvided() {
		return timeZonesProvided;
	}

	public void setTimeZonesProvided(List<String> timeZonesProvided) {
		this.timeZonesProvided = timeZonesProvided;
	}

	public List<ExecutorProvided> getPreferListProvided() {
		return preferListProvided;
	}

	public void setPreferListProvided(List<ExecutorProvided> preferListProvided) {
		this.preferListProvided = preferListProvided;
	}

	public List<String> getUpStreamProvided() {
		return upStreamProvided;
	}

	public void setUpStreamProvided(List<String> upStreamProvided) {
		this.upStreamProvided = upStreamProvided;
	}

	public List<String> getDownStreamProvided() {
		return downStreamProvided;
	}

	public void setDownStreamProvided(List<String> downStreamProvided) {
		this.downStreamProvided = downStreamProvided;
	}

	public JobStatus getStatus() {
		return status;
	}

	public void setStatus(JobStatus status) {
		this.status = status;
	}

}
