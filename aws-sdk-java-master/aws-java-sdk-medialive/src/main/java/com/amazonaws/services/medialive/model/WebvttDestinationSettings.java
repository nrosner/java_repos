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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Webvtt Destination Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/WebvttDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebvttDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Controls whether the color and position of the source captions is passed through to the WebVTT output captions.
     * PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't pass through the
     * style. The output captions will not contain any font styling information.
     */
    private String styleControl;

    /**
     * Controls whether the color and position of the source captions is passed through to the WebVTT output captions.
     * PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't pass through the
     * style. The output captions will not contain any font styling information.
     * 
     * @param styleControl
     *        Controls whether the color and position of the source captions is passed through to the WebVTT output
     *        captions. PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't
     *        pass through the style. The output captions will not contain any font styling information.
     * @see WebvttDestinationStyleControl
     */

    public void setStyleControl(String styleControl) {
        this.styleControl = styleControl;
    }

    /**
     * Controls whether the color and position of the source captions is passed through to the WebVTT output captions.
     * PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't pass through the
     * style. The output captions will not contain any font styling information.
     * 
     * @return Controls whether the color and position of the source captions is passed through to the WebVTT output
     *         captions. PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't
     *         pass through the style. The output captions will not contain any font styling information.
     * @see WebvttDestinationStyleControl
     */

    public String getStyleControl() {
        return this.styleControl;
    }

    /**
     * Controls whether the color and position of the source captions is passed through to the WebVTT output captions.
     * PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't pass through the
     * style. The output captions will not contain any font styling information.
     * 
     * @param styleControl
     *        Controls whether the color and position of the source captions is passed through to the WebVTT output
     *        captions. PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't
     *        pass through the style. The output captions will not contain any font styling information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebvttDestinationStyleControl
     */

    public WebvttDestinationSettings withStyleControl(String styleControl) {
        setStyleControl(styleControl);
        return this;
    }

    /**
     * Controls whether the color and position of the source captions is passed through to the WebVTT output captions.
     * PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't pass through the
     * style. The output captions will not contain any font styling information.
     * 
     * @param styleControl
     *        Controls whether the color and position of the source captions is passed through to the WebVTT output
     *        captions. PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't
     *        pass through the style. The output captions will not contain any font styling information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebvttDestinationStyleControl
     */

    public WebvttDestinationSettings withStyleControl(WebvttDestinationStyleControl styleControl) {
        this.styleControl = styleControl.toString();
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
        if (getStyleControl() != null)
            sb.append("StyleControl: ").append(getStyleControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebvttDestinationSettings == false)
            return false;
        WebvttDestinationSettings other = (WebvttDestinationSettings) obj;
        if (other.getStyleControl() == null ^ this.getStyleControl() == null)
            return false;
        if (other.getStyleControl() != null && other.getStyleControl().equals(this.getStyleControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStyleControl() == null) ? 0 : getStyleControl().hashCode());
        return hashCode;
    }

    @Override
    public WebvttDestinationSettings clone() {
        try {
            return (WebvttDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.WebvttDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}