/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifactsForServiceAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProvisioningArtifactsForServiceActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * An array of objects with information about product views and provisioning artifacts.
     * </p>
     */
    private java.util.List<ProvisioningArtifactView> provisioningArtifactViews;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects with information about product views and provisioning artifacts.
     * </p>
     * 
     * @return An array of objects with information about product views and provisioning artifacts.
     */

    public java.util.List<ProvisioningArtifactView> getProvisioningArtifactViews() {
        return provisioningArtifactViews;
    }

    /**
     * <p>
     * An array of objects with information about product views and provisioning artifacts.
     * </p>
     * 
     * @param provisioningArtifactViews
     *        An array of objects with information about product views and provisioning artifacts.
     */

    public void setProvisioningArtifactViews(java.util.Collection<ProvisioningArtifactView> provisioningArtifactViews) {
        if (provisioningArtifactViews == null) {
            this.provisioningArtifactViews = null;
            return;
        }

        this.provisioningArtifactViews = new java.util.ArrayList<ProvisioningArtifactView>(provisioningArtifactViews);
    }

    /**
     * <p>
     * An array of objects with information about product views and provisioning artifacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifactViews(java.util.Collection)} or
     * {@link #withProvisioningArtifactViews(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifactViews
     *        An array of objects with information about product views and provisioning artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningArtifactsForServiceActionResult withProvisioningArtifactViews(ProvisioningArtifactView... provisioningArtifactViews) {
        if (this.provisioningArtifactViews == null) {
            setProvisioningArtifactViews(new java.util.ArrayList<ProvisioningArtifactView>(provisioningArtifactViews.length));
        }
        for (ProvisioningArtifactView ele : provisioningArtifactViews) {
            this.provisioningArtifactViews.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects with information about product views and provisioning artifacts.
     * </p>
     * 
     * @param provisioningArtifactViews
     *        An array of objects with information about product views and provisioning artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningArtifactsForServiceActionResult withProvisioningArtifactViews(
            java.util.Collection<ProvisioningArtifactView> provisioningArtifactViews) {
        setProvisioningArtifactViews(provisioningArtifactViews);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningArtifactsForServiceActionResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getProvisioningArtifactViews() != null)
            sb.append("ProvisioningArtifactViews: ").append(getProvisioningArtifactViews()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisioningArtifactsForServiceActionResult == false)
            return false;
        ListProvisioningArtifactsForServiceActionResult other = (ListProvisioningArtifactsForServiceActionResult) obj;
        if (other.getProvisioningArtifactViews() == null ^ this.getProvisioningArtifactViews() == null)
            return false;
        if (other.getProvisioningArtifactViews() != null && other.getProvisioningArtifactViews().equals(this.getProvisioningArtifactViews()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisioningArtifactViews() == null) ? 0 : getProvisioningArtifactViews().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisioningArtifactsForServiceActionResult clone() {
        try {
            return (ListProvisioningArtifactsForServiceActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
