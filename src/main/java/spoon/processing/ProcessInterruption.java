/**
 * Copyright (C) 2006-2016 INRIA and contributors
 * Spoon - http://spoon.gforge.inria.fr/
 *
 * This software is governed by the CeCILL-C License under French law and
 * abiding by the rules of distribution of free software. You can use, modify
 * and/or redistribute the software under the terms of the CeCILL-C license as
 * circulated by CEA, CNRS and INRIA at http://www.cecill.info.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the CeCILL-C License for more details.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C license and that you accept its terms.
 */
package spoon.processing;

/**
 * This exception is used to interrupt a processor during its processing.
 */
public class ProcessInterruption extends RuntimeException {
	public ProcessInterruption() {
	}

	public ProcessInterruption(String message) {
		super(message);
	}

	public ProcessInterruption(String message, Throwable cause) {
		super(message, cause);
	}

	public ProcessInterruption(Throwable cause) {
		super(cause);
	}
}
