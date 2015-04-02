// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2015  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Thu, 02 Apr 15 00:20:51 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaLiveReportExportJobData extends KalturaJobData {
    public int timeReference = Integer.MIN_VALUE;
    public int timeZoneOffset = Integer.MIN_VALUE;
    public String entryIds;
    public String outputPath;
    public String recipientEmail;

    public KalturaLiveReportExportJobData() {
    }

    public KalturaLiveReportExportJobData(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("timeReference")) {
                this.timeReference = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("timeZoneOffset")) {
                this.timeZoneOffset = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryIds")) {
                this.entryIds = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("outputPath")) {
                this.outputPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("recipientEmail")) {
                this.recipientEmail = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaLiveReportExportJobData");
        kparams.add("timeReference", this.timeReference);
        kparams.add("timeZoneOffset", this.timeZoneOffset);
        kparams.add("entryIds", this.entryIds);
        kparams.add("outputPath", this.outputPath);
        kparams.add("recipientEmail", this.recipientEmail);
        return kparams;
    }

}

