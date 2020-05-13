/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store. It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.wso2.am.integration.clients.store.api.v1.dto.ApplicationKeyDTO;

/**
 * ApplicationDTO
 */

public class ApplicationDTO {
  @SerializedName("applicationId")
  private String applicationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("throttlingPolicy")
  private String throttlingPolicy = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Type of the access token generated for this application. **OAUTH:** A UUID based access token which is issued by default. **JWT:** A self-contained, signed JWT based access token. **Note:** This can be only used in Microgateway environments. 
   */
  @JsonAdapter(TokenTypeEnum.Adapter.class)
  public enum TokenTypeEnum {
    OAUTH("OAUTH"),
    
    JWT("JWT");

    private String value;

    TokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenTypeEnum fromValue(String text) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TokenTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tokenType")
  private TokenTypeEnum tokenType = TokenTypeEnum.JWT;

  @SerializedName("status")
  private String status = "";

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("subscriptionCount")
  private Integer subscriptionCount = null;

  @SerializedName("keys")
  private List<ApplicationKeyDTO> keys = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = null;

  @SerializedName("subscriptionScopes")
  private List<String> subscriptionScopes = null;

  @SerializedName("owner")
  private String owner = null;

  public ApplicationDTO applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorApp", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationDTO throttlingPolicy(String throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
    return this;
  }

   /**
   * Get throttlingPolicy
   * @return throttlingPolicy
  **/
  @ApiModelProperty(example = "Unlimited", required = true, value = "")
  public String getThrottlingPolicy() {
    return throttlingPolicy;
  }

  public void setThrottlingPolicy(String throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
  }

  public ApplicationDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Sample calculator application", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationDTO tokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Type of the access token generated for this application. **OAUTH:** A UUID based access token which is issued by default. **JWT:** A self-contained, signed JWT based access token. **Note:** This can be only used in Microgateway environments. 
   * @return tokenType
  **/
  @ApiModelProperty(example = "JWT", value = "Type of the access token generated for this application. **OAUTH:** A UUID based access token which is issued by default. **JWT:** A self-contained, signed JWT based access token. **Note:** This can be only used in Microgateway environments. ")
  public TokenTypeEnum getTokenType() {
    return tokenType;
  }

  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }

  public ApplicationDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "APPROVED", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ApplicationDTO groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ApplicationDTO addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(example = "\"\"", value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ApplicationDTO subscriptionCount(Integer subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
    return this;
  }

   /**
   * Get subscriptionCount
   * @return subscriptionCount
  **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionCount() {
    return subscriptionCount;
  }

  public void setSubscriptionCount(Integer subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
  }

  public ApplicationDTO keys(List<ApplicationKeyDTO> keys) {
    this.keys = keys;
    return this;
  }

  public ApplicationDTO addKeysItem(ApplicationKeyDTO keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(example = "[]", value = "")
  public List<ApplicationKeyDTO> getKeys() {
    return keys;
  }

  public void setKeys(List<ApplicationKeyDTO> keys) {
    this.keys = keys;
  }

  public ApplicationDTO attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ApplicationDTO putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "\"External Reference ID, Billing Tier\"", value = "")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public ApplicationDTO subscriptionScopes(List<String> subscriptionScopes) {
    this.subscriptionScopes = subscriptionScopes;
    return this;
  }

  public ApplicationDTO addSubscriptionScopesItem(String subscriptionScopesItem) {
    if (this.subscriptionScopes == null) {
      this.subscriptionScopes = new ArrayList<>();
    }
    this.subscriptionScopes.add(subscriptionScopesItem);
    return this;
  }

   /**
   * Get subscriptionScopes
   * @return subscriptionScopes
  **/
  @ApiModelProperty(example = "[\"admin\"]", value = "")
  public List<String> getSubscriptionScopes() {
    return subscriptionScopes;
  }

  public void setSubscriptionScopes(List<String> subscriptionScopes) {
    this.subscriptionScopes = subscriptionScopes;
  }

  public ApplicationDTO owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Application created user 
   * @return owner
  **/
  @ApiModelProperty(example = "admin", value = "Application created user ")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationDTO application = (ApplicationDTO) o;
    return Objects.equals(this.applicationId, application.applicationId) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.throttlingPolicy, application.throttlingPolicy) &&
        Objects.equals(this.description, application.description) &&
        Objects.equals(this.tokenType, application.tokenType) &&
        Objects.equals(this.status, application.status) &&
        Objects.equals(this.groups, application.groups) &&
        Objects.equals(this.subscriptionCount, application.subscriptionCount) &&
        Objects.equals(this.keys, application.keys) &&
        Objects.equals(this.attributes, application.attributes) &&
        Objects.equals(this.subscriptionScopes, application.subscriptionScopes) &&
        Objects.equals(this.owner, application.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, name, throttlingPolicy, description, tokenType, status, groups, subscriptionCount, keys, attributes, subscriptionScopes, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationDTO {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    throttlingPolicy: ").append(toIndentedString(throttlingPolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    subscriptionScopes: ").append(toIndentedString(subscriptionScopes)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

