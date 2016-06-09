package usecase

class FizzBuzz : UseCase<FizzBuzz.Request, FizzBuzz.Response> {

    override fun execute(request: Request): Response {
        val fizzBuzz = domain.FizzBuzz(request.input)
        return Response(fizzBuzz.result())
    }

    class Request(val input: Int): UseCase.Request

    class Response(val message: String): UseCase.Response
}