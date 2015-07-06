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

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "result", "messages" })
public class GTMCResult {

    @JsonProperty("result")
    private String result;
    @JsonProperty("messages")
    private List<GTMCMessage> messages;

    /**
     * @return The result
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * @param result
     *            The result
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return The messages
     */
    @JsonProperty("messages")
    public List<GTMCMessage> getMessages() {
        if (null == messages) {
            messages = new ArrayList<GTMCMessage>();
        }
        return messages;
    }

    /**
     * @param messages
     *            The messages
     */
    @JsonProperty("messages")
    public void setMessages(List<GTMCMessage> messages) {
        this.messages = messages;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GTMCResult [\n");
        if (result != null) {
            builder.append("result=");
            builder.append(result);
            builder.append(",\n ");
        }
        if (messages != null) {
            builder.append("messages=");
            builder.append(messages);
        }
        builder.append("\n]");
        return builder.toString();
    }

    
    
}
