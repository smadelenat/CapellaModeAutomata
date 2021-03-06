package com.thalesgroup.trt.mde.vp.time.time.impl;

import com.thalesgroup.trt.mde.vp.time.time.Instant;
import com.thalesgroup.trt.mde.vp.time.time.InstantInterval;
import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instant Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl#isIsLowerOpen <em>Is Lower Open</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl#isIsUpperOpen <em>Is Upper Open</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantIntervalImpl extends InstantImpl implements InstantInterval {

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Instant min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Instant max;

	/**
	 * The default value of the '{@link #isIsLowerOpen() <em>Is Lower Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLowerOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOWER_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLowerOpen() <em>Is Lower Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLowerOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean isLowerOpen = IS_LOWER_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUpperOpen() <em>Is Upper Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUpperOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UPPER_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUpperOpen() <em>Is Upper Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUpperOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean isUpperOpen = IS_UPPER_OPEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantIntervalImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.INSTANT_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Instant getMin() {

		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetMin(Instant newMin, NotificationChain msgs) {

		Instant oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.INSTANT_INTERVAL__MIN,
					oldMin, newMin);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMin(Instant newMin) {

		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject) min)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.INSTANT_INTERVAL__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject) newMin)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.INSTANT_INTERVAL__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.INSTANT_INTERVAL__MIN, newMin, newMin));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Instant getMax() {

		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetMax(Instant newMax, NotificationChain msgs) {

		Instant oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.INSTANT_INTERVAL__MAX,
					oldMax, newMax);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMax(Instant newMax) {

		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject) max)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.INSTANT_INTERVAL__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject) newMax)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.INSTANT_INTERVAL__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.INSTANT_INTERVAL__MAX, newMax, newMax));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isIsLowerOpen() {

		return isLowerOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIsLowerOpen(boolean newIsLowerOpen) {

		boolean oldIsLowerOpen = isLowerOpen;
		isLowerOpen = newIsLowerOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.INSTANT_INTERVAL__IS_LOWER_OPEN,
					oldIsLowerOpen, isLowerOpen));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isIsUpperOpen() {

		return isUpperOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIsUpperOpen(boolean newIsUpperOpen) {

		boolean oldIsUpperOpen = isUpperOpen;
		isUpperOpen = newIsUpperOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.INSTANT_INTERVAL__IS_UPPER_OPEN,
					oldIsUpperOpen, isUpperOpen));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimePackage.INSTANT_INTERVAL__MIN:
			return basicSetMin(null, msgs);
		case TimePackage.INSTANT_INTERVAL__MAX:
			return basicSetMax(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimePackage.INSTANT_INTERVAL__MIN:
			return getMin();
		case TimePackage.INSTANT_INTERVAL__MAX:
			return getMax();
		case TimePackage.INSTANT_INTERVAL__IS_LOWER_OPEN:
			return isIsLowerOpen();
		case TimePackage.INSTANT_INTERVAL__IS_UPPER_OPEN:
			return isIsUpperOpen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimePackage.INSTANT_INTERVAL__MIN:
			setMin((Instant) newValue);
			return;
		case TimePackage.INSTANT_INTERVAL__MAX:
			setMax((Instant) newValue);
			return;
		case TimePackage.INSTANT_INTERVAL__IS_LOWER_OPEN:
			setIsLowerOpen((Boolean) newValue);
			return;
		case TimePackage.INSTANT_INTERVAL__IS_UPPER_OPEN:
			setIsUpperOpen((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TimePackage.INSTANT_INTERVAL__MIN:
			setMin((Instant) null);
			return;
		case TimePackage.INSTANT_INTERVAL__MAX:
			setMax((Instant) null);
			return;
		case TimePackage.INSTANT_INTERVAL__IS_LOWER_OPEN:
			setIsLowerOpen(IS_LOWER_OPEN_EDEFAULT);
			return;
		case TimePackage.INSTANT_INTERVAL__IS_UPPER_OPEN:
			setIsUpperOpen(IS_UPPER_OPEN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TimePackage.INSTANT_INTERVAL__MIN:
			return min != null;
		case TimePackage.INSTANT_INTERVAL__MAX:
			return max != null;
		case TimePackage.INSTANT_INTERVAL__IS_LOWER_OPEN:
			return isLowerOpen != IS_LOWER_OPEN_EDEFAULT;
		case TimePackage.INSTANT_INTERVAL__IS_UPPER_OPEN:
			return isUpperOpen != IS_UPPER_OPEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLowerOpen: "); //$NON-NLS-1$
		result.append(isLowerOpen);
		result.append(", isUpperOpen: "); //$NON-NLS-1$
		result.append(isUpperOpen);
		result.append(')');
		return result.toString();
	}

} //InstantIntervalImpl