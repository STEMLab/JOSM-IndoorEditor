/*
 * Copyright 2015 Trilogis Srl
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
package eu.ilocate.gtmc.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "messageType", "messageTitle", "messageDetail" })
public class GTMCMessage {

    @JsonProperty("messageType")
    private String messageType;
    @JsonProperty("messageTitle")
    private String messageTitle;
    @JsonProperty("messageDetail")
    private String messageDetail;

    /**
     * @return The messageType
     */
    @JsonProperty("messageType")
    public String getMessageType() {
        return messageType;
    }

    /**
     * @param messageType
     *            The messageType
     */
    @JsonProperty("messageType")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * @return The messageTitle
     */
    @JsonProperty("messageTitle")
    public String getMessageTitle() {
        return messageTitle;
    }

    /**
     * @param messageTitle
     *            The messageTitle
     */
    @JsonProperty("messageTitle")
    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    /**
     * @return The messageDetail
     */
    @JsonProperty("messageDetail")
    public String getMessageDetail() {
        return messageDetail;
    }

    /**
     * @param messageDetail
     *            The messageDetail
     */
    @JsonProperty("messageDetail")
    public void setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n\tGTMCMessage [");
        if (messageType != null) {
            builder.append("\n\t messageType=");
            builder.append(messageType);
            builder.append(",\n\t ");
        }
        if (messageTitle != null) {
            builder.append("messageTitle=");
            builder.append(messageTitle);
            builder.append(",\n\t ");
        }
        if (messageDetail != null) {
            builder.append("messageDetail=");
            builder.append(messageDetail);
        }
        builder.append("\n\t]");
        return builder.toString();
    }

}
