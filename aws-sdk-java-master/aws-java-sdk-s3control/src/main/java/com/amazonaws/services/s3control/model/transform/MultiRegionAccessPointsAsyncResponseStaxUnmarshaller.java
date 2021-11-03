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
package com.amazonaws.services.s3control.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MultiRegionAccessPointsAsyncResponse StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionAccessPointsAsyncResponseStaxUnmarshaller implements Unmarshaller<MultiRegionAccessPointsAsyncResponse, StaxUnmarshallerContext> {

    public MultiRegionAccessPointsAsyncResponse unmarshall(StaxUnmarshallerContext context) throws Exception {
        MultiRegionAccessPointsAsyncResponse multiRegionAccessPointsAsyncResponse = new MultiRegionAccessPointsAsyncResponse();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return multiRegionAccessPointsAsyncResponse;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Regions", targetDepth)) {
                    multiRegionAccessPointsAsyncResponse.withRegions(new ArrayList<MultiRegionAccessPointRegionalResponse>());
                    continue;
                }

                if (context.testExpression("Regions/Region", targetDepth)) {
                    multiRegionAccessPointsAsyncResponse.withRegions(MultiRegionAccessPointRegionalResponseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return multiRegionAccessPointsAsyncResponse;
                }
            }
        }
    }

    private static MultiRegionAccessPointsAsyncResponseStaxUnmarshaller instance;

    public static MultiRegionAccessPointsAsyncResponseStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MultiRegionAccessPointsAsyncResponseStaxUnmarshaller();
        return instance;
    }
}