package com.masonic.persistence;

import java.io.PrintWriter;
import java.io.PrintStream;

import com.opal.*;

import com.masonic.application.*;

@StoreGeneratedPrimaryKey
public final class QuestionOpal extends com.opal.UpdatableOpal<Question> {
	public static final java.lang.String ourDefaultQuestionStatusCode = "DRAFTED";

	private QuestionOpal() {
		super();
		setUserFacing(null);
	}

	public QuestionOpal(OpalFactory<Question, QuestionOpal> argOpalFactory, Object[] argValues) {
		super(argOpalFactory, argValues);
	}

	@Override
	protected void applyDefaults() {
		getNewValues()[7] = java.time.LocalDateTime.now();
		getNewValues()[9] = ourDefaultQuestionStatusCode;
		return;
	}

	@Override
	protected void initializeReferences() {
		myOldStatusOpal = QuestionStatusOpal.NOT_YET_LOADED;
		myOldIntendedPacketSetOpal = PacketSetOpal.NOT_YET_LOADED;
		myOldWriterOpal = AccountOpal.NOT_YET_LOADED;
		myOldCategoryOpal = CategoryOpal.NOT_YET_LOADED;
		myOldQuestionTypeOpal = QuestionTypeOpal.NOT_YET_LOADED;
		myOldPlacementOpal = PlacementOpal.NOT_YET_LOADED;
		return;
	}

	/* package */ static final String[] ourFieldNames = new String[] {
		"Id",
		"CategoryCode",
		"InternalNote",
		"ExternalNote",
		"QuestionTypeCode",
		"Label",
		"WriterAccountId",
		"Updated",
		"IntendedPacketSetCode",
		"QuestionStatusCode",
	};

	/* package */ static final Class<?>[] ourFieldTypes = new Class<?>[] {
		java.lang.Integer.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.String.class,
		java.lang.Integer.class,
		java.time.LocalDateTime.class,
		java.lang.String.class,
		java.lang.String.class,
	};

	/* package */ static final boolean[] ourFieldNullability = new boolean[] {
		false,
		false,
		true,
		true,
		false,
		false,
		false,
		false,
		true,
		false,
	};

	/* package */ static final FieldValidator[] ourFieldValidators = new FieldValidator[] {
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
	};

	public static final QuestionOpal NOT_YET_LOADED = new QuestionOpal();

	public static String[] getStaticFieldNames() { return ourFieldNames; }

	public static Class<?>[] getStaticFieldTypes() { return ourFieldTypes; }

	@Override
	public Class<?>[] getFieldTypes() { return ourFieldTypes; }

	public static boolean[] getStaticFieldNullability() { return ourFieldNullability; }

	@Override
	public FieldValidator[] getFieldValidators() { return ourFieldValidators; }

	@Override
	public boolean[] getFieldNullability() { return ourFieldNullability; }

	public static FieldValidator[] getStaticFieldValidators() { return ourFieldValidators; }


	public synchronized java.lang.Integer getIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[0];
	}

	public synchronized java.lang.String getCategoryCode() {
		return (java.lang.String) getReadValueSet()[1];
	}

	public synchronized java.lang.String getInternalNote() {
		return (java.lang.String) getReadValueSet()[2];
	}

	public synchronized java.lang.String getExternalNote() {
		return (java.lang.String) getReadValueSet()[3];
	}

	public synchronized java.lang.String getQuestionTypeCode() {
		return (java.lang.String) getReadValueSet()[4];
	}

	public synchronized java.lang.String getLabel() {
		return (java.lang.String) getReadValueSet()[5];
	}

	public synchronized java.lang.Integer getWriterAccountIdAsObject() {
		return (java.lang.Integer) getReadValueSet()[6];
	}

	public synchronized java.time.LocalDateTime getUpdated() {
		return (java.time.LocalDateTime) getReadValueSet()[7];
	}

	public synchronized java.lang.String getIntendedPacketSetCode() {
		return (java.lang.String) getReadValueSet()[8];
	}

	public synchronized java.lang.String getQuestionStatusCode() {
		return (java.lang.String) getReadValueSet()[9];
	}

	public synchronized void setId(final java.lang.Integer argId) {
		tryMutate();
		if (argId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myId on " + this + " to null.");
		}
		getNewValues()[0] = argId;
		return;
	}

	public void setId(final int argId) {
		setId(java.lang.Integer.valueOf(argId));
		return;
	}

	public synchronized void setCategoryCode(final java.lang.String argCategoryCode) {
		tryMutate();
		if (argCategoryCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myCategoryCode on " + this + " to null.");
		}
		if (argCategoryCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myCategoryCode on " + this + " is 32.", argCategoryCode.length(), 32);
		}
		getNewValues()[1] = argCategoryCode;
		return;
	}

	public synchronized void setInternalNote(final java.lang.String argInternalNote) {
		tryMutate();
		getNewValues()[2] = argInternalNote;
		return;
	}

	public synchronized void setExternalNote(final java.lang.String argExternalNote) {
		tryMutate();
		getNewValues()[3] = argExternalNote;
		return;
	}

	public synchronized void setQuestionTypeCode(final java.lang.String argQuestionTypeCode) {
		tryMutate();
		if (argQuestionTypeCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionTypeCode on " + this + " to null.");
		}
		if (argQuestionTypeCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myQuestionTypeCode on " + this + " is 32.", argQuestionTypeCode.length(), 32);
		}
		getNewValues()[4] = argQuestionTypeCode;
		return;
	}

	public synchronized void setLabel(final java.lang.String argLabel) {
		tryMutate();
		if (argLabel == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myLabel on " + this + " to null.");
		}
		if (argLabel.length() > 256) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myLabel on " + this + " is 256.", argLabel.length(), 256);
		}
		getNewValues()[5] = argLabel;
		return;
	}

	public synchronized void setWriterAccountId(final java.lang.Integer argWriterAccountId) {
		tryMutate();
		if (argWriterAccountId == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myWriterAccountId on " + this + " to null.");
		}
		getNewValues()[6] = argWriterAccountId;
		return;
	}

	public void setWriterAccountId(final int argWriterAccountId) {
		setWriterAccountId(java.lang.Integer.valueOf(argWriterAccountId));
		return;
	}

	public synchronized void setUpdated(final java.time.LocalDateTime argUpdated) {
		tryMutate();
		if (argUpdated == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myUpdated on " + this + " to null.");
		}
		getNewValues()[7] = argUpdated;
		return;
	}

	public synchronized void setIntendedPacketSetCode(final java.lang.String argIntendedPacketSetCode) {
		tryMutate();
		if ((argIntendedPacketSetCode != null) && (argIntendedPacketSetCode.length() > 32)) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myIntendedPacketSetCode on " + this + " is 32.", argIntendedPacketSetCode.length(), 32);
		}
		getNewValues()[8] = argIntendedPacketSetCode;
		return;
	}

	public synchronized void setQuestionStatusCode(final java.lang.String argQuestionStatusCode) {
		tryMutate();
		if (argQuestionStatusCode == null) {
			throw new com.opal.IllegalNullArgumentException("Cannot set myQuestionStatusCode on " + this + " to null.");
		}
		if (argQuestionStatusCode.length() > 32) {
			throw new com.opal.ArgumentTooLongException("Maximum length of myQuestionStatusCode on " + this + " is 32.", argQuestionStatusCode.length(), 32);
		}
		getNewValues()[9] = argQuestionStatusCode;
		return;
	}

	@Override
	protected /* synchronized */ void copyOldValuesToNewInternal() {
		myNewStatusOpal = myOldStatusOpal;
		myNewIntendedPacketSetOpal = myOldIntendedPacketSetOpal;
		myNewWriterOpal = myOldWriterOpal;
		myNewCategoryOpal = myOldCategoryOpal;
		myNewQuestionTypeOpal = myOldQuestionTypeOpal;
		myNewPlacementOpal = myOldPlacementOpal;
		/* We don't copy Collections of other Opals; they will be cloned as needed. */
		return;
	}

	@Override
	protected /* synchronized */ void copyNewValuesToOldInternal() {
		myOldStatusOpal = myNewStatusOpal;
		myOldIntendedPacketSetOpal = myNewIntendedPacketSetOpal;
		myOldWriterOpal = myNewWriterOpal;
		myOldCategoryOpal = myNewCategoryOpal;
		myOldQuestionTypeOpal = myNewQuestionTypeOpal;

		myOldPlacementOpal = myNewPlacementOpal;
		return;
	}

	@Override
	protected void unlinkInternal() {
		if (getPlacementOpal() != null) {
			getPlacementOpal().setQuestionOpalInternal(null);
		}
		if (getStatusOpal() != null) {
			getStatusOpal().removeQuestionOpalInternal(this);
		}
		if (getIntendedPacketSetOpal() != null) {
			getIntendedPacketSetOpal().removeIntendedQuestionOpalInternal(this);
		}
		if (getWriterOpal() != null) {
			getWriterOpal().removeWriterQuestionOpalInternal(this);
		}
		if (getCategoryOpal() != null) {
			getCategoryOpal().removeQuestionOpalInternal(this);
		}
		if (getQuestionTypeOpal() != null) {
			getQuestionTypeOpal().removeQuestionOpalInternal(this);
		}
		return;
	}

	@Override
	protected void copyFieldsToInternal(UpdatableOpal<Question> argTarget) {
		Object[] lclValues = getReadValueSet();
		Object[] lclTargetNewValues = argTarget.getNewValues();
		/* Field 0 (Id) is database generated. */
		lclTargetNewValues[1] = lclValues[1]; /* CategoryCode (immutable) */
		lclTargetNewValues[2] = lclValues[2]; /* InternalNote (immutable) */
		lclTargetNewValues[3] = lclValues[3]; /* ExternalNote (immutable) */
		lclTargetNewValues[4] = lclValues[4]; /* QuestionTypeCode (immutable) */
		lclTargetNewValues[5] = lclValues[5]; /* Label (immutable) */
		lclTargetNewValues[6] = lclValues[6]; /* WriterAccountId (immutable) */
		lclTargetNewValues[7] = lclValues[7]; /* Updated (immutable) */
		lclTargetNewValues[8] = lclValues[8]; /* IntendedPacketSetCode (immutable) */
		lclTargetNewValues[9] = lclValues[9]; /* QuestionStatusCode (immutable) */

		return;
	}

	@Override
	public synchronized void translateReferencesToFields() {
		if (myNewStatusOpal != QuestionStatusOpal.NOT_YET_LOADED) {
			setQuestionStatusCode(myNewStatusOpal == null ? null : myNewStatusOpal.getCode());
		}
		if (myNewIntendedPacketSetOpal != PacketSetOpal.NOT_YET_LOADED) {
			setIntendedPacketSetCode(myNewIntendedPacketSetOpal == null ? null : myNewIntendedPacketSetOpal.getCode());
		}
		if (myNewWriterOpal != AccountOpal.NOT_YET_LOADED) {
			setWriterAccountId(myNewWriterOpal == null ? null : myNewWriterOpal.getIdAsObject());
		}
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryCode(myNewCategoryOpal == null ? null : myNewCategoryOpal.getCode());
		}
		if (myNewQuestionTypeOpal != QuestionTypeOpal.NOT_YET_LOADED) {
			setQuestionTypeCode(myNewQuestionTypeOpal == null ? null : myNewQuestionTypeOpal.getCode());
		}
		return;
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredPriorCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myNewIntendedPacketSetOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myNewStatusOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewCategoryOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewQuestionTypeOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myNewWriterOpal;
		if ((lclUO != null) && lclUO.isNew()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public java.util.Set<com.opal.TransactionAware> getRequiredSubsequentCommits() {
		java.util.Set<com.opal.TransactionAware> lclTAs = null;
		UpdatableOpal<?> lclUO;
		lclUO = myOldIntendedPacketSetOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			lclTAs = new com.siliconage.util.Fast3Set<>();
			lclTAs.add(lclUO);
		}
		lclUO = myOldStatusOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldCategoryOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldQuestionTypeOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		lclUO = myOldWriterOpal;
		if ((lclUO != null) && lclUO.isDeleted()) {
			if (lclTAs == null) {
				lclTAs = new com.siliconage.util.Fast3Set<>();
			}
			lclTAs.add(lclUO);
		}
		return (lclTAs != null) && (lclTAs.size() > 0) ? lclTAs : java.util.Collections.emptySet();
	}

	@Override
	public Object[] getPrimaryKeyWhereClauseValues() {
		return new Object[] {getOldValues()[0], };
	}

	private static int getFieldCountInternal() { return ourFieldNames.length; }

	@Override
	protected int getFieldCount() { return getFieldCountInternal(); }

	@Override
	protected String[] getFieldNames() { return ourFieldNames; }

	@Override
	public synchronized void output(final PrintWriter argPW) {
		argPW.println("Id = " + getIdAsObject());
		argPW.println("CategoryCode = " + getCategoryCode());
		argPW.println("InternalNote = " + getInternalNote());
		argPW.println("ExternalNote = " + getExternalNote());
		argPW.println("QuestionTypeCode = " + getQuestionTypeCode());
		argPW.println("Label = " + getLabel());
		argPW.println("WriterAccountId = " + getWriterAccountIdAsObject());
		argPW.println("Updated = " + getUpdated());
		argPW.println("IntendedPacketSetCode = " + getIntendedPacketSetCode());
		argPW.println("QuestionStatusCode = " + getQuestionStatusCode());
	}

	@Override
	public synchronized void output(final PrintStream argPS) {
		argPS.println("Id = " + getIdAsObject());
		argPS.println("CategoryCode = " + getCategoryCode());
		argPS.println("InternalNote = " + getInternalNote());
		argPS.println("ExternalNote = " + getExternalNote());
		argPS.println("QuestionTypeCode = " + getQuestionTypeCode());
		argPS.println("Label = " + getLabel());
		argPS.println("WriterAccountId = " + getWriterAccountIdAsObject());
		argPS.println("Updated = " + getUpdated());
		argPS.println("IntendedPacketSetCode = " + getIntendedPacketSetCode());
		argPS.println("QuestionStatusCode = " + getQuestionStatusCode());
	}

	private QuestionStatusOpal myOldStatusOpal;
	private QuestionStatusOpal myNewStatusOpal;

	protected QuestionStatusOpal retrieveStatusOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[9] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionStatusOpalFactory().forCode(getQuestionStatusCode());
	}

	public synchronized QuestionStatusOpal getStatusOpal() {
		QuestionStatusOpal lclQuestionStatusOpal;
		boolean lclAccess = tryAccess();
		lclQuestionStatusOpal = lclAccess ? myNewStatusOpal : myOldStatusOpal;
		if (lclQuestionStatusOpal == QuestionStatusOpal.NOT_YET_LOADED) {
			lclQuestionStatusOpal = retrieveStatusOpal(getReadValueSet());
			if (lclAccess) {
				myNewStatusOpal = lclQuestionStatusOpal;
			} else {
				myOldStatusOpal = lclQuestionStatusOpal;
			}
		}
		return lclQuestionStatusOpal;
	}

	public synchronized void setStatusOpal(QuestionStatusOpal argQuestionStatusOpal) {
		tryMutate();
		QuestionStatusOpal lclQuestionStatusOpal = getStatusOpal();
		if (lclQuestionStatusOpal == argQuestionStatusOpal) { return; }
		if (lclQuestionStatusOpal != null) {
			lclQuestionStatusOpal.removeQuestionOpalInternal(this);
		}
		myNewStatusOpal = argQuestionStatusOpal;
		if (argQuestionStatusOpal != null) {
			argQuestionStatusOpal.addQuestionOpalInternal(this);
		}
		return;
	}

	protected synchronized void setStatusOpalInternal(QuestionStatusOpal argQuestionStatusOpal) {
		tryMutate();
		myNewStatusOpal = argQuestionStatusOpal;
	}

	private PacketSetOpal myOldIntendedPacketSetOpal;
	private PacketSetOpal myNewIntendedPacketSetOpal;

	protected PacketSetOpal retrieveIntendedPacketSetOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[8] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPacketSetOpalFactory().forCode(getIntendedPacketSetCode());
	}

	public synchronized PacketSetOpal getIntendedPacketSetOpal() {
		PacketSetOpal lclPacketSetOpal;
		boolean lclAccess = tryAccess();
		lclPacketSetOpal = lclAccess ? myNewIntendedPacketSetOpal : myOldIntendedPacketSetOpal;
		if (lclPacketSetOpal == PacketSetOpal.NOT_YET_LOADED) {
			lclPacketSetOpal = retrieveIntendedPacketSetOpal(getReadValueSet());
			if (lclAccess) {
				myNewIntendedPacketSetOpal = lclPacketSetOpal;
			} else {
				myOldIntendedPacketSetOpal = lclPacketSetOpal;
			}
		}
		return lclPacketSetOpal;
	}

	public synchronized void setIntendedPacketSetOpal(PacketSetOpal argPacketSetOpal) {
		tryMutate();
		PacketSetOpal lclPacketSetOpal = getIntendedPacketSetOpal();
		if (lclPacketSetOpal == argPacketSetOpal) { return; }
		if (lclPacketSetOpal != null) {
			lclPacketSetOpal.removeIntendedQuestionOpalInternal(this);
		}
		myNewIntendedPacketSetOpal = argPacketSetOpal;
		if (argPacketSetOpal != null) {
			argPacketSetOpal.addIntendedQuestionOpalInternal(this);
		}
		return;
	}

	protected synchronized void setIntendedPacketSetOpalInternal(PacketSetOpal argPacketSetOpal) {
		tryMutate();
		myNewIntendedPacketSetOpal = argPacketSetOpal;
	}

	private AccountOpal myOldWriterOpal;
	private AccountOpal myNewWriterOpal;

	protected AccountOpal retrieveWriterOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[6] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getAccountOpalFactory().forId(getWriterAccountIdAsObject());
	}

	public synchronized AccountOpal getWriterOpal() {
		AccountOpal lclAccountOpal;
		boolean lclAccess = tryAccess();
		lclAccountOpal = lclAccess ? myNewWriterOpal : myOldWriterOpal;
		if (lclAccountOpal == AccountOpal.NOT_YET_LOADED) {
			lclAccountOpal = retrieveWriterOpal(getReadValueSet());
			if (lclAccess) {
				myNewWriterOpal = lclAccountOpal;
			} else {
				myOldWriterOpal = lclAccountOpal;
			}
		}
		return lclAccountOpal;
	}

	public synchronized void setWriterOpal(AccountOpal argAccountOpal) {
		tryMutate();
		AccountOpal lclAccountOpal = getWriterOpal();
		if (lclAccountOpal == argAccountOpal) { return; }
		if (lclAccountOpal != null) {
			lclAccountOpal.removeWriterQuestionOpalInternal(this);
		}
		myNewWriterOpal = argAccountOpal;
		if (argAccountOpal != null) {
			argAccountOpal.addWriterQuestionOpalInternal(this);
		}
		return;
	}

	protected synchronized void setWriterOpalInternal(AccountOpal argAccountOpal) {
		tryMutate();
		myNewWriterOpal = argAccountOpal;
	}

	private CategoryOpal myOldCategoryOpal;
	private CategoryOpal myNewCategoryOpal;

	protected CategoryOpal retrieveCategoryOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[1] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getCategoryOpalFactory().forCode(getCategoryCode());
	}

	public synchronized CategoryOpal getCategoryOpal() {
		CategoryOpal lclCategoryOpal;
		boolean lclAccess = tryAccess();
		lclCategoryOpal = lclAccess ? myNewCategoryOpal : myOldCategoryOpal;
		if (lclCategoryOpal == CategoryOpal.NOT_YET_LOADED) {
			lclCategoryOpal = retrieveCategoryOpal(getReadValueSet());
			if (lclAccess) {
				myNewCategoryOpal = lclCategoryOpal;
			} else {
				myOldCategoryOpal = lclCategoryOpal;
			}
		}
		return lclCategoryOpal;
	}

	public synchronized void setCategoryOpal(CategoryOpal argCategoryOpal) {
		tryMutate();
		CategoryOpal lclCategoryOpal = getCategoryOpal();
		if (lclCategoryOpal == argCategoryOpal) { return; }
		if (lclCategoryOpal != null) {
			lclCategoryOpal.removeQuestionOpalInternal(this);
		}
		myNewCategoryOpal = argCategoryOpal;
		if (argCategoryOpal != null) {
			argCategoryOpal.addQuestionOpalInternal(this);
		}
		return;
	}

	protected synchronized void setCategoryOpalInternal(CategoryOpal argCategoryOpal) {
		tryMutate();
		myNewCategoryOpal = argCategoryOpal;
	}

	private QuestionTypeOpal myOldQuestionTypeOpal;
	private QuestionTypeOpal myNewQuestionTypeOpal;

	protected QuestionTypeOpal retrieveQuestionTypeOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[4] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getQuestionTypeOpalFactory().forCode(getQuestionTypeCode());
	}

	public synchronized QuestionTypeOpal getQuestionTypeOpal() {
		QuestionTypeOpal lclQuestionTypeOpal;
		boolean lclAccess = tryAccess();
		lclQuestionTypeOpal = lclAccess ? myNewQuestionTypeOpal : myOldQuestionTypeOpal;
		if (lclQuestionTypeOpal == QuestionTypeOpal.NOT_YET_LOADED) {
			lclQuestionTypeOpal = retrieveQuestionTypeOpal(getReadValueSet());
			if (lclAccess) {
				myNewQuestionTypeOpal = lclQuestionTypeOpal;
			} else {
				myOldQuestionTypeOpal = lclQuestionTypeOpal;
			}
		}
		return lclQuestionTypeOpal;
	}

	public synchronized void setQuestionTypeOpal(QuestionTypeOpal argQuestionTypeOpal) {
		tryMutate();
		QuestionTypeOpal lclQuestionTypeOpal = getQuestionTypeOpal();
		if (lclQuestionTypeOpal == argQuestionTypeOpal) { return; }
		if (lclQuestionTypeOpal != null) {
			lclQuestionTypeOpal.removeQuestionOpalInternal(this);
		}
		myNewQuestionTypeOpal = argQuestionTypeOpal;
		if (argQuestionTypeOpal != null) {
			argQuestionTypeOpal.addQuestionOpalInternal(this);
		}
		return;
	}

	protected synchronized void setQuestionTypeOpalInternal(QuestionTypeOpal argQuestionTypeOpal) {
		tryMutate();
		myNewQuestionTypeOpal = argQuestionTypeOpal;
	}

	private PlacementOpal myOldPlacementOpal;
	private PlacementOpal myNewPlacementOpal;

	protected PlacementOpal retrievePlacementOpal(Object[] argValueSet) {
		assert argValueSet != null;
		if ((argValueSet[0] == null)) {
			return null;
		}
		return OpalFactoryFactory.getInstance().getPlacementOpalFactory().forQuestionId(getIdAsObject());
	}

	public synchronized PlacementOpal getPlacementOpal() {
		PlacementOpal lclPlacementOpal;
		boolean lclAccess = tryAccess();
		lclPlacementOpal = lclAccess ? myNewPlacementOpal : myOldPlacementOpal;
		if (lclPlacementOpal == PlacementOpal.NOT_YET_LOADED) {
			lclPlacementOpal = retrievePlacementOpal(getReadValueSet());
			if (lclAccess) {
				myNewPlacementOpal = lclPlacementOpal;
			} else {
				myOldPlacementOpal = lclPlacementOpal;
			}
		}
		return lclPlacementOpal;
	}

	public synchronized void setPlacementOpal(PlacementOpal argPlacementOpal) {
		tryMutate();
		myNewPlacementOpal = argPlacementOpal;
		if (argPlacementOpal != null) {
			argPlacementOpal.setQuestionOpalInternal(this);
		}
		return;
	}

	public synchronized void setPlacementOpalInternal(PlacementOpal argPlacementOpal) {
		tryMutate();
		myNewPlacementOpal = argPlacementOpal;
	}

	@Override
	public String toString() {
		StringBuilder lclSB =  new StringBuilder(64);
		lclSB.append("QuestionOpal[");
		lclSB.append("myId=");
		lclSB.append(toStringField(0));
		lclSB.append(']');
		return lclSB.toString();
	}

	@Override
	protected void updateReferencesAfterReload() {
		if (myNewStatusOpal != QuestionStatusOpal.NOT_YET_LOADED) {
			setStatusOpal(retrieveStatusOpal(getNewValues()));
		}
		if (myNewIntendedPacketSetOpal != PacketSetOpal.NOT_YET_LOADED) {
			setIntendedPacketSetOpal(retrieveIntendedPacketSetOpal(getNewValues()));
		}
		if (myNewWriterOpal != AccountOpal.NOT_YET_LOADED) {
			setWriterOpal(retrieveWriterOpal(getNewValues()));
		}
		if (myNewCategoryOpal != CategoryOpal.NOT_YET_LOADED) {
			setCategoryOpal(retrieveCategoryOpal(getNewValues()));
		}
		if (myNewQuestionTypeOpal != QuestionTypeOpal.NOT_YET_LOADED) {
			setQuestionTypeOpal(retrieveQuestionTypeOpal(getNewValues()));
		}
	}

}