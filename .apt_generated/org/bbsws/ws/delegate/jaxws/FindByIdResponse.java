
package org.bbsws.ws.delegate.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findByIdResponse", namespace = "http://ws.bbsws.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findByIdResponse", namespace = "http://ws.bbsws.org/")
public class FindByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private org.bbsws.vo.ConfigVO _return;

    /**
     * 
     * @return
     *     returns ConfigVO
     */
    public org.bbsws.vo.ConfigVO getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(org.bbsws.vo.ConfigVO _return) {
        this._return = _return;
    }

}
