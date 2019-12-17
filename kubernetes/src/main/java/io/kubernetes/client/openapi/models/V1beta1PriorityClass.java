/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 */
@ApiModel(description = "DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-17T11:16:41.964Z[Etc/UTC]")
public class V1beta1PriorityClass {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GLOBAL_DEFAULT = "globalDefault";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DEFAULT)
  private Boolean globalDefault;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_PREEMPTION_POLICY = "preemptionPolicy";
  @SerializedName(SERIALIZED_NAME_PREEMPTION_POLICY)
  private String preemptionPolicy;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;


  public V1beta1PriorityClass apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1beta1PriorityClass description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description is an arbitrary string that usually provides guidelines on when this priority class should be used.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V1beta1PriorityClass globalDefault(Boolean globalDefault) {
    
    this.globalDefault = globalDefault;
    return this;
  }

   /**
   * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as &#x60;globalDefault&#x60;. However, if more than one PriorityClasses exists with their &#x60;globalDefault&#x60; field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
   * @return globalDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.")

  public Boolean getGlobalDefault() {
    return globalDefault;
  }


  public void setGlobalDefault(Boolean globalDefault) {
    this.globalDefault = globalDefault;
  }


  public V1beta1PriorityClass kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1beta1PriorityClass metadata(V1ObjectMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1beta1PriorityClass preemptionPolicy(String preemptionPolicy) {
    
    this.preemptionPolicy = preemptionPolicy;
    return this;
  }

   /**
   * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
   * @return preemptionPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.")

  public String getPreemptionPolicy() {
    return preemptionPolicy;
  }


  public void setPreemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
  }


  public V1beta1PriorityClass value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.")

  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PriorityClass v1beta1PriorityClass = (V1beta1PriorityClass) o;
    return Objects.equals(this.apiVersion, v1beta1PriorityClass.apiVersion) &&
        Objects.equals(this.description, v1beta1PriorityClass.description) &&
        Objects.equals(this.globalDefault, v1beta1PriorityClass.globalDefault) &&
        Objects.equals(this.kind, v1beta1PriorityClass.kind) &&
        Objects.equals(this.metadata, v1beta1PriorityClass.metadata) &&
        Objects.equals(this.preemptionPolicy, v1beta1PriorityClass.preemptionPolicy) &&
        Objects.equals(this.value, v1beta1PriorityClass.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, description, globalDefault, kind, metadata, preemptionPolicy, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PriorityClass {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    globalDefault: ").append(toIndentedString(globalDefault)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    preemptionPolicy: ").append(toIndentedString(preemptionPolicy)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

