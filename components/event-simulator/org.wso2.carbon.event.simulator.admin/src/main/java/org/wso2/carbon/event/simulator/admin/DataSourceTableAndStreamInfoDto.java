/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.event.simulator.admin;


public class DataSourceTableAndStreamInfoDto {
    private String configurationName;
    private String dataSourceName;
    private String tableName;
    private String eventStreamID;
    private String[] columnNames;
    private String[] streamAttributeNames;
    private String filePath;
    private String fileName;
    private long delayBetweenEventsInMillis;
    private String status;


    public DataSourceTableAndStreamInfoDto() {
        configurationName = null;
        eventStreamID = null;
        columnNames = null; //array
        streamAttributeNames = null;
        tableName = null;
        fileName = null;
        filePath = null;
        dataSourceName = null;
        delayBetweenEventsInMillis = 0;
    }

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    public String getConfigurationName() {
        return configurationName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setEventStreamID(String eventStreamID) {
        this.eventStreamID = eventStreamID;
    }

    public String getEventStreamID() {
        return eventStreamID;
    }


    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setStreamAttributeNames(String[] streamAttributeNames) {
        this.streamAttributeNames = streamAttributeNames;
    }

    public String[] getStreamAttributeNames() {
        return streamAttributeNames;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public long getDelayBetweenEventsInMillis() {
        return delayBetweenEventsInMillis;
    }

    public void setDelayBetweenEventsInMillis(long delayBetweenEventsInMillis) {
        this.delayBetweenEventsInMillis = delayBetweenEventsInMillis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
