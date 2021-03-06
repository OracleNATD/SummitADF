package oracle.summit.model.views;

import java.sql.Date;

import java.util.List;

import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;

import oracle.summit.base.SummitEntityImpl;
import oracle.summit.base.SummitViewRowImpl;
import oracle.summit.model.entities.CustomerEOImpl;
import oracle.summit.model.entities.OrdEOImpl;

import oracle.jbo.Row;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 25 11:45:11 GMT 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrdVORowImpl extends SummitViewRowImpl {
    public static final int ENTITY_ORDEO = 0;
    public static final int ENTITY_EMPEO = 1;
    public static final int ENTITY_CUSTOMEREO = 2;

    /**
     * This is the default constructor (do not remove).
     */
    public OrdVORowImpl() {
    }

    /**
     * Gets OrdEO entity object.
     * @return the OrdEO
     */
    public OrdEOImpl getOrdEO() {
        return (OrdEOImpl)getEntity(0);
    }

    /**
     * Gets EmpEO entity object.
     * @return the EmpEO
     */
    public SummitEntityImpl getEmpEO() {
        return (SummitEntityImpl)getEntity(1);
    }

    /**
     * Gets CustomerEO entity object.
     * @return the CustomerEO
     */
    public CustomerEOImpl getCustomerEO() {
        return (CustomerEOImpl) getEntity(2);
    }


    /**
     * Sample exportable method.
     */
    public void sampleOrdVORowImplExportable() {
    }

    /**
     * Sample exportable method.
     */
    public void sampleOrdVORowImplExportable2(String testParam1) {
    }

    /**
     * Sample exportable method.
     */
    public List<String> sampleOrdVORowImplExportable3(List<String> listParam,
                                                      String testParam1) {
        return listParam;
    }

    public oracle.jbo.domain.Number calculateTimeToShip(Date ordered,
                                                        Date shipped) {

        if (null != shipped) {
            long days =
                (shipped.getTime() - ordered.getTime()) / (1000 * 60 * 60 *
                                                           24);

            return new Number(days);
        } else
            return new Number(0);

    }

    @Override
    public void setNewRowState(byte b) {
        if (b==Row.STATUS_INITIALIZED) {
        b=Row.STATUS_NEW;
        }
        super.setNewRowState(b);
    }
}
