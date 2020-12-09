export type AsyncData<T> = {
    loading?: boolean;
    data: T;
    error?: string;
};