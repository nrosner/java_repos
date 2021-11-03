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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecoveryGroupReadinessSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Upper bound on number of records to return. */
    private Integer maxResults;
    /** A token used to resume pagination from the end of a previous request. */
    private String nextToken;
    /** The name of the RecoveryGroup */
    private String recoveryGroupName;

    /**
     * Upper bound on number of records to return.
     * 
     * @param maxResults
     *        Upper bound on number of records to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Upper bound on number of records to return.
     * 
     * @return Upper bound on number of records to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Upper bound on number of records to return.
     * 
     * @param maxResults
     *        Upper bound on number of records to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupReadinessSummaryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @return A token used to resume pagination from the end of a previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupReadinessSummaryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The name of the RecoveryGroup
     * 
     * @param recoveryGroupName
     *        The name of the RecoveryGroup
     */

    public void setRecoveryGroupName(String recoveryGroupName) {
        this.recoveryGroupName = recoveryGroupName;
    }

    /**
     * The name of the RecoveryGroup
     * 
     * @return The name of the RecoveryGroup
     */

    public String getRecoveryGroupName() {
        return this.recoveryGroupName;
    }

    /**
     * The name of the RecoveryGroup
     * 
     * @param recoveryGroupName
     *        The name of the RecoveryGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupReadinessSummaryRequest withRecoveryGroupName(String recoveryGroupName) {
        setRecoveryGroupName(recoveryGroupName);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecoveryGroupName() != null)
            sb.append("RecoveryGroupName: ").append(getRecoveryGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecoveryGroupReadinessSummaryRequest == false)
            return false;
        GetRecoveryGroupReadinessSummaryRequest other = (GetRecoveryGroupReadinessSummaryRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecoveryGroupName() == null ^ this.getRecoveryGroupName() == null)
            return false;
        if (other.getRecoveryGroupName() != null && other.getRecoveryGroupName().equals(this.getRecoveryGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecoveryGroupName() == null) ? 0 : getRecoveryGroupName().hashCode());
        return hashCode;
    }

    @Override
    public GetRecoveryGroupReadinessSummaryRequest clone() {
        return (GetRecoveryGroupReadinessSummaryRequest) super.clone();
    }

}