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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeServiceUpdates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceUpdatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of service updates
     * </p>
     */
    private java.util.List<ServiceUpdate> serviceUpdates;

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @return An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *         nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * 
     * @return A list of service updates
     */

    public java.util.List<ServiceUpdate> getServiceUpdates() {
        return serviceUpdates;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates
     */

    public void setServiceUpdates(java.util.Collection<ServiceUpdate> serviceUpdates) {
        if (serviceUpdates == null) {
            this.serviceUpdates = null;
            return;
        }

        this.serviceUpdates = new java.util.ArrayList<ServiceUpdate>(serviceUpdates);
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceUpdates(java.util.Collection)} or {@link #withServiceUpdates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesResult withServiceUpdates(ServiceUpdate... serviceUpdates) {
        if (this.serviceUpdates == null) {
            setServiceUpdates(new java.util.ArrayList<ServiceUpdate>(serviceUpdates.length));
        }
        for (ServiceUpdate ele : serviceUpdates) {
            this.serviceUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of service updates
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesResult withServiceUpdates(java.util.Collection<ServiceUpdate> serviceUpdates) {
        setServiceUpdates(serviceUpdates);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceUpdates() != null)
            sb.append("ServiceUpdates: ").append(getServiceUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceUpdatesResult == false)
            return false;
        DescribeServiceUpdatesResult other = (DescribeServiceUpdatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceUpdates() == null ^ this.getServiceUpdates() == null)
            return false;
        if (other.getServiceUpdates() != null && other.getServiceUpdates().equals(this.getServiceUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdates() == null) ? 0 : getServiceUpdates().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceUpdatesResult clone() {
        try {
            return (DescribeServiceUpdatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}