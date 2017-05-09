/*
 * $Id: CustomActionForward.java 421488 2006-07-13 03:43:08Z wsmoak $
 *
 * Copyright 1999-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.struts.webapp.examples;


import org.apache.struts.action.*;


/**
 * Custom ActionForward to demonstrate usage.
 *
 * @version $Rev: 421488 $ $Date: 2006-07-12 20:43:08 -0700 (Wed, 12 Jul 2006) $
 */

public final class CustomActionForward extends ActionForward {


    // --------------------------------------------------- Instance Variables


    /**
     * An example String property.
     */
    private String example = "";


    // ----------------------------------------------------------- Properties


    /**
     * Return the example String.
     */
    public String getExample() {

        return (this.example);

    }


    /**
     * Set the example String.
     *
     * @param example The new example String.
     */
    public void setExample(String example) {

        this.example = example;

    }

}
