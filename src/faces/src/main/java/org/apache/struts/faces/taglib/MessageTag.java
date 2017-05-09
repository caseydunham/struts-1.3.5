/*
 * Copyright 2002-2004 The Apache Software Foundation.
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

package org.apache.struts.faces.taglib;


import javax.faces.component.UIComponent;


/**
 * <p>Render a localized message, with optional substitution parameters, for
 * the <em>Struts-Faces Integration Library</em>.</p>
 *
 *
 * @version $Rev: 421138 $ $Date: 2006-07-11 22:41:40 -0700 (Tue, 11 Jul 2006) $
 */

public class MessageTag extends AbstractFacesTag {


    // ---------------------------------------------------------- Tag Attributes


    /**
     * <p>Flag indicating that rendered content should be filtered for
     * characters that are sensitive in HTML.</p>
     */
    private String filter = null;

    public void setFilter(String filter) {
        this.filter = filter;
    }


    /**
     * <p>Message key used to retrieve the requested message
     */
    private String key = null;

    public void setKey(String key) {
        this.key = key;
    }


    // ------------------------------------------------------------- Tag Methods


    /**
     * <p>Release any allocated resources.
     */
    public void release() {

        super.release();
        filter = null;
        key = null;

    }


    // ---------------------------------------------------------- Public Methods


    /**
     * <p>Return the type of component to be created for this tag.</p>
     */
    public String getComponentType() {

        return ("org.apache.struts.faces.Message");

    }


    /**
     * <p>Return the <code>rendererType</code> to be used for rendering
     * our component.</p>
     */
    public String getRendererType() {

        return ("org.apache.struts.faces.Message");

    }


    // ------------------------------------------------------- Protected Methods


    /**
     * <p>Override attributes set on this tag instance.</p>
     *
     * @param component Component whose attributes should be overridden
     */
    protected void setProperties(UIComponent component) {

        super.setProperties(component);
        setBooleanAttribute(component, "filter", filter);
        setStringAttribute(component, "key", key);

    }


}
