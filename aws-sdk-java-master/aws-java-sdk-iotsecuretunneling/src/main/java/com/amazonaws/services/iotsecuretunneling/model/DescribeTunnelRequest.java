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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/DescribeTunnel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTunnelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The tunnel to describe.
     * </p>
     */
    private String tunnelId;

    /**
     * <p>
     * The tunnel to describe.
     * </p>
     * 
     * @param tunnelId
     *        The tunnel to describe.
     */

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    /**
     * <p>
     * The tunnel to describe.
     * </p>
     * 
     * @return The tunnel to describe.
     */

    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * <p>
     * The tunnel to describe.
     * </p>
     * 
     * @param tunnelId
     *        The tunnel to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTunnelRequest withTunnelId(String tunnelId) {
        setTunnelId(tunnelId);
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
        if (getTunnelId() != null)
            sb.append("TunnelId: ").append(getTunnelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTunnelRequest == false)
            return false;
        DescribeTunnelRequest other = (DescribeTunnelRequest) obj;
        if (other.getTunnelId() == null ^ this.getTunnelId() == null)
            return false;
        if (other.getTunnelId() != null && other.getTunnelId().equals(this.getTunnelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelId() == null) ? 0 : getTunnelId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTunnelRequest clone() {
        return (DescribeTunnelRequest) super.clone();
    }

}