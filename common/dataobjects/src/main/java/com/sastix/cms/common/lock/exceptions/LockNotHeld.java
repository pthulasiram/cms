/*
 * Copyright(c) 2017 the original author or authors.
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

package com.sastix.cms.common.lock.exceptions;

import com.sastix.cms.common.exception.BusinessException;

/**
 * The supplied resource UID cannot be renewed, it is not locked by this owner or has already expired.
 * <p/>
 * NOTE:
 * The exception object should contain the owner holding the lock and expiry date/time, if applicable.
 */
public class LockNotHeld extends BusinessException {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 8767664848085951856L;

    /**
     * Constructor that allows a specific error message to be specified.
     *
     * @param message detail message.
     */
    public LockNotHeld(String message) {
        super(message);
    }
}
