/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * (Optional) Invalidates the provided token.
 * </p>
 */
public class RevokeTokenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) The token the client wants to revoke.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String token;

    /**
     * <p>
     * (Optional) The client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * (Optional) The secret for the client ID. if the client ID has a secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientSecret;

    /**
     * <p>
     * (Optional) The token the client wants to revoke.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         (Optional) The token the client wants to revoke.
     *         </p>
     */
    public String getToken() {
        return token;
    }

    /**
     * <p>
     * (Optional) The token the client wants to revoke.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param token <p>
     *            (Optional) The token the client wants to revoke.
     *            </p>
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * (Optional) The token the client wants to revoke.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param token <p>
     *            (Optional) The token the client wants to revoke.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeTokenRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * <p>
     * (Optional) The client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         (Optional) The client ID.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * (Optional) The client ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            (Optional) The client ID.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * (Optional) The client ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            (Optional) The client ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeTokenRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * (Optional) The secret for the client ID. if the client ID has a secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         (Optional) The secret for the client ID. if the client ID has a
     *         secret.
     *         </p>
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * <p>
     * (Optional) The secret for the client ID. if the client ID has a secret.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientSecret <p>
     *            (Optional) The secret for the client ID. if the client ID has
     *            a secret.
     *            </p>
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * (Optional) The secret for the client ID. if the client ID has a secret.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientSecret <p>
     *            (Optional) The secret for the client ID. if the client ID has
     *            a secret.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeTokenRequest withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getToken() != null)
            sb.append("Token: " + getToken() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: " + getClientSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeTokenRequest == false)
            return false;
        RevokeTokenRequest other = (RevokeTokenRequest) obj;

        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null
                && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        return true;
    }
}
