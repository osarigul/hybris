/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.turkcell.tcp.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.turkcell.tcp.fulfilmentprocess.constants.TcpFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class TcpFulfilmentProcessManager extends GeneratedTcpFulfilmentProcessManager
{
	public static final TcpFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TcpFulfilmentProcessManager) em.getExtension(TcpFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
