package com.hk.poc.actions;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.validation.Validate;



@UrlBinding("/stripes/show")
public class ShowNameActionBean implements ActionBean {

    private ActionBeanContext context;
    @Validate( required = true )
    private String name;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    @Override
    public void setContext( final ActionBeanContext context ) {
        this.context = context;
    }


    @DefaultHandler
    public Resolution addition() {
        this.setResult("Hello "+ this.getName()+" !");
        return new ForwardResolution( "/index.jsp" );
    }

}
