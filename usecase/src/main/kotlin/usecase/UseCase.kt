package usecase

interface UseCase<I: UseCase.Request, O: UseCase.Response> {

    fun execute(request: I): O

    interface Request

    interface Response
}