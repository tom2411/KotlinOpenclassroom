package Cours4_expression_when_enum

class cours4 {

    // IF EXPRESSION

    // Java
    // int result =  a > b ? a : b;
    // équivaut à
    val result = if (a > b) a else b

    // à terme on peut écrire
    var a = 10
    var b = 12

    val result = if (a > b){
        a++
        a
    } else {
        b++
        b
    }

    // revoie 13
    print("Result is : $result")

    // WHEN

    // Java switch
    /*int apiResponse = 200;

    switch (apiResponse) {
        case 200: System.out.print("OK");
        break;
        case 404: System.out.print("NOT FOUND");
        break;
        case 401: System.out.print("UNAUTHORIZED");
        break;
        case 403: System.out.print("FORBIDDEN");
        break;
        default: System.out.print("UNKNOWN");
        break;
    }*/

    // en Kotlin, on utilise un expression when
    var apiResponse = 404

    when (apiResponse) {
        200 -> print("OK")
        404 -> print("NOT FOUND")
        401 -> print("UNAUTHORIZED")
        403 -> print("FORBIDDEN")
        else -> print("UNKNOWN")
    }

    // c'est également une expression
    fun printResponse(apiResponse: Int) = when (apiResponse) {
        200 -> print("OK")
        404 -> print("NOT FOUND")
        401 -> print("UNAUTHORIZED")
        403 -> print("FORBIDDEN")
        else -> print("UNKNOWN")
    }

    // plus permissive que le switch de Java
    val apiResponse = 200

    when (apiResponse) {
        200, 201, 202 -> print("SUCCESS")
        300, 301, 302 -> print("REDIRECTION")
        400, 404 -> print("ERROR")
        else -> print("UNKNOWN")
    }

    // Tellement permissive que l'on peut se passer de lui passer le paramètre
    val apiResponse = 200

    when {
        isSuccess(apiResponse) -> print("SUCCESS")
        isError(apiResponse) -> print("ERROR")
    }

    fun isSuccess(apiResponse: Int) = apiResponse = 200 || apiResponse = 201 || apiResponse = 202
    fun isError(apiResponse: Int) = apiResponse = 400 || apiResponse = 404

    // Manipuler des ranges avec le when
    val numberToFind = 55

    when(numberToFind) {
        in 1..33 -> print("Number is between 1 and 33")
        in 34..66 -> print("Number is between 34 and 66")
        in 67..100 -> print("Number is between 67 and 100")
    }

    // LES ENUMERATIONS

    // Java
    /*public enum ApiResponse {
        OK,
        NOT_FOUND,
        UNAUTHORIZED,
        FORBIDDEN,
        UNKNOWN
    }*/

    // Kotlin
    enum class ApiResponse {
        OK,
        NOT_FOUND,
        UNAUTHORIZED,
        FORBIDDEN,
        UNKNOWN
    }

    // Ajouter des propriétés à l'enumeration
    enum class ApiResponse1(code: Int) {
        OK(200),
        NOT_FOUND(404),
        UNAUTHORIZED(401),
        FORBIDDEN(403),
        UNKNOWN(0)
    }

    //Combiner le when et l'enumeration
    val response: ApiResponse = ApiResponse.OK

    when(response){
        ApiResponse.OK -> print("OK")
        ApiResponse.NOT_FOUND -> print("NOT_FOUND")
        ApiResponse.UNAUTHORIZED -> print("UNAUTHORIZED")
        ApiResponse.FORBIDDEN -> print("FORBIDDEN")
        ApiResponse.UNKNOWN -> print("UNKNOWN")
    }





}