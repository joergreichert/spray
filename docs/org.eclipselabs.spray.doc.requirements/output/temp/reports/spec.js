/***
* Checks to see if the string passed in is either
* null or empty
*/
function isEmptyString(strValue) {
    if(strValue == null || strValue == "" || strValue == "null" || strValue.length == 0)
        return true;
    else
        return false;
}

/* Retrieve the EObject with the fragement id and get the eResource from "@self" of this row or one of its parents */
function getEObject(firstRow, id) {
	var currentRow = firstRow;
	var element = currentRow["@self"].getObject();
	while (currentRow != null && (element == null || element.eResource() == null)) {
		currentRow = currentRow._outer;
		element = currentRow["@self"].getObject();
	}
	var result = firstRow["@self"].getObject();
	if (element != null) {
		result = element.eResource().getEObject(id);
	}
	return result
}


/** Get the image info from root spec model for the element with the name filename
 */
function getImageInfo(eObject,fileName){
	var model = eObject;
	while (model != null && !(model instanceof com.yakindu.red.report.specmodel.specmodel.Model)){
		model = model.eContainer();
	}
	if (model != null){
		var listOfDimensions = model.getImageDimensions();
		for (var i=0;i<listOfDimensions.size();i++) {
			var info = listOfDimensions.get(i);
			if (fileName.equals(info.fileName)){
				return info;
			}
		};
	}
	return null;
}

/** Get the imageWidth from root spec model for the element with the name  prefix+suffix
 */
function getNewWidth(eObject, prefix, suffix) {
	var info = getImageInfo(eObject, prefix + suffix); 
	if(info != null && info.getWidth() > 0) {
		var newWidth = info.getWidth()/2; 
		return newWidth;
	}
	return null;
}

/* Print the flows of a postCondition */
function printPostConditionSource(postCondition) {
	var result = "";
	if (postCondition.isPostConditionOfDefault() 
			&& (!postCondition.getAlternativeFlows().isEmpty()
				|| !postCondition.getExceptionFlows().isEmpty() )) {
		result = "(Default";
	}
	if (!postCondition.getAlternativeFlows().isEmpty()) {
		for (var i=0;i<postCondition.getAlternativeFlows().size();i++){
			if (result.equals("")){
				result = "("+postCondition.getAlternativeFlows().get(i);
			} else {
				result = result+", "+postCondition.getAlternativeFlows().get(i);
			}
		}
	}
	if (!postCondition.getExceptionFlows().isEmpty()) {
		for (var i=0;i<postCondition.getExceptionFlows().size();i++){
			if (result.equals("")){
				result = "("+postCondition.getExceptionFlows().get(i);
			} else {
				result = result+", "+postCondition.getExceptionFlows().get(i);
			}
		}
	}
	if (!result.equals("")){
		result = result+")";
	}
	return result;
}