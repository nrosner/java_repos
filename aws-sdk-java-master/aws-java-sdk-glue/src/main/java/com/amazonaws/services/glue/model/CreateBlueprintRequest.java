/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateBlueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBlueprintRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the blueprint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published.
     * </p>
     */
    private String blueprintLocation;
    /**
     * <p>
     * The tags to be applied to this blueprint.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @return The name of the blueprint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueprintRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the blueprint.
     * </p>
     * 
     * @param description
     *        A description of the blueprint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the blueprint.
     * </p>
     * 
     * @return A description of the blueprint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the blueprint.
     * </p>
     * 
     * @param description
     *        A description of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueprintRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published.
     * </p>
     * 
     * @param blueprintLocation
     *        Specifies a path in Amazon S3 where the blueprint is published.
     */

    public void setBlueprintLocation(String blueprintLocation) {
        this.blueprintLocation = blueprintLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published.
     * </p>
     * 
     * @return Specifies a path in Amazon S3 where the blueprint is published.
     */

    public String getBlueprintLocation() {
        return this.blueprintLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published.
     * </p>
     * 
     * @param blueprintLocation
     *        Specifies a path in Amazon S3 where the blueprint is published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueprintRequest withBlueprintLocation(String blueprintLocation) {
        setBlueprintLocation(blueprintLocation);
        return this;
    }

    /**
     * <p>
     * The tags to be applied to this blueprint.
     * </p>
     * 
     * @return The tags to be applied to this blueprint.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be applied to this blueprint.
     * </p>
     * 
     * @param tags
     *        The tags to be applied to this blueprint.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be applied to this blueprint.
     * </p>
     * 
     * @param tags
     *        The tags to be applied to this blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueprintRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateBlueprintRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueprintRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueprintRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBlueprintLocation() != null)
            sb.append("BlueprintLocation: ").append(getBlueprintLocation()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBlueprintRequest == false)
            return false;
        CreateBlueprintRequest other = (CreateBlueprintRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBlueprintLocation() == null ^ this.getBlueprintLocation() == null)
            return false;
        if (other.getBlueprintLocation() != null && other.getBlueprintLocation().equals(this.getBlueprintLocation()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBlueprintLocation() == null) ? 0 : getBlueprintLocation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBlueprintRequest clone() {
        return (CreateBlueprintRequest) super.clone();
    }

}